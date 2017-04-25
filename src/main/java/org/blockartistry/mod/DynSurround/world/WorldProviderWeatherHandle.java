/*
 * This file is part of Dynamic Surroundings Unofficial, licensed under the MIT License (MIT).
 *
 * Copyright (c) Abastro
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.blockartistry.mod.DynSurround.world;

import java.io.IOException;
import java.lang.reflect.Field;

import org.blockartistry.mod.DynSurround.ModLog;
import org.blockartistry.mod.DynSurround.ModOptions;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import com.google.common.base.Throwables;

import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderSurface;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModClassLoader;

public class WorldProviderWeatherHandle extends WorldProviderShimBase {
	
	private boolean patchWeather = true;

	public WorldProviderWeatherHandle(final World world, final WorldProvider provider) {
		super(world, provider);

		if(provider.getClass() == WorldProviderSurface.class)
			return;
		
		ModLog.info("Processing inspection on world provider class %s for compat", provider.getClass().getName());
		
		try {
			ModClassLoader modClassLoader = Loader.instance().getModClassLoader();
			Field mainLoaderField = modClassLoader.getClass().getDeclaredField("mainClassLoader");
			mainLoaderField.setAccessible(true);
			LaunchClassLoader classLoader = (LaunchClassLoader) mainLoaderField.get(modClassLoader);

			new ClassReader(classLoader.getClassBytes(provider.getClass().getName())).accept(new ClassVisitor(Opcodes.ASM5) {
				@Override
				public MethodVisitor visitMethod(int access, String name, String desc, 
						String signature, String[] exceptions) {
					if(name.equals("updateWeather")) {
			        	ModLog.info("Visiting method %s with description %s named updateWeather() on WorldProvider",
			        			name, desc);
			        	
			        	patchWeather = false;
						
						return new MethodVisitor(Opcodes.ASM5) {
							boolean isTheMethod = true;

							@Override
							public void visitParameter(String name, int access) {
								this.isTheMethod = false;
							}

					        @Override
					        public void visitMethodInsn(int opcode, String owner, String name,
					                String desc, boolean itf) {
					        	if(!this.isTheMethod)
					        		return;

					        	ModLog.info("Visiting method call %s with description %s during inspection on WorldProvider#updateWeather(), for compat",
					        			name, desc);

					        	try {
									if(name.equals("updateWeatherBody") && desc.equals(Type.getMethodDescriptor(World.class.getMethod("updateWeatherBody")))) {
										patchWeather = true;
										ModLog.info("Found World#updateWeatherBody() from WorldProvider#updateWeather()");
									} else if(name.equals("updateWeather") && desc.equals(Type.getMethodDescriptor(WorldProvider.class.getMethod("updateWeather")))) {
										patchWeather = true;
										ModLog.info("Found WorldProvider#updateWeather() from WorldProvider#updateWeather()");
									}
								} catch (NoSuchMethodException exc) {
									Throwables.propagate(exc);
								}
					        }
						};
					}
					return null;
				}
			}, 0);
		} catch (IOException exc) {
			Throwables.propagate(exc);
		} catch (ReflectiveOperationException exc) {
			Throwables.propagate(exc);
		}
	}

	@Override
	public void resetRainAndThunder() {
		if(ModOptions.resetRainOnSleep)
			provider.resetRainAndThunder();
	}
	
	@Override
	public void updateWeather() {
		if(!worldObj.isRemote && this.patchWeather) {
			WorldHandler.updateWeatherBody(this.worldObj);
			return;
		}

		provider.updateWeather();
	}

}
