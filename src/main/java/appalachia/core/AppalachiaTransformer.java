package appalachia.core;

import com.google.common.collect.Lists;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraftforge.fml.common.FMLLog;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * This class is dedicated to the Appalachia addon for RTG
 * The complete source code for this mod can be found on github.
 * Class: AppalachiaTransformer
 * Created by HellFirePvP
 * Date: 12.02.2017 / 15:24
 */
public class AppalachiaTransformer implements IClassTransformer {

    public AppalachiaTransformer() {
        FMLLog.info("[AppalachiaTransformer] Initialized.");
    }

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        if(!transformedName.equals("net.minecraft.block.BlockLeaves")) {
            return basicClass;
        }

        //TODO keep those updated with minecraft updates as SRG names or parameters may change!
        String methodNameGetCollisionBox = AppalachiaCore.isDebofEnabled ? "func_180646_a" : "getCollisionBoundingBox";
        String methodDescGetCollisionBox = "(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/AxisAlignedBB;";

        String methodNameIsPassable = AppalachiaCore.isDebofEnabled ? "func_176205_b" : "isPassable";
        String methodDescIsPassable = "(Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Z";

        String fieldNullAABB = AppalachiaCore.isDebofEnabled ? "field_185506_k" : "NULL_AABB";

        ClassNode node = new ClassNode();
        ClassReader reader = new ClassReader(basicClass);
        reader.accept(node, 0);

        //Check sanity before doing anything.
        //Potentially also the place where you want to check for configs.
        //Keep in mind this is called well before preInit
        boolean transform = true;
        for (MethodNode mn : node.methods) {
            if(mn.name.equalsIgnoreCase(methodNameGetCollisionBox) || mn.name.equalsIgnoreCase(methodNameIsPassable)) {
                transform = false;
            }
        }
        if(!transform) {
            FMLLog.info("[AppalachiaTransformer] BlockLeaves was modified by another Class transformer. Not doing changes.");
            return basicClass;
        }

        /* ****************************************** *

        getCollisionBox method construction

         * ****************************************** */

        LabelNode startLabel = new LabelNode();
        LabelNode endLabel = new LabelNode();
        MethodNode getCollisionBox = new MethodNode(Opcodes.ACC_PUBLIC, methodNameGetCollisionBox, methodDescGetCollisionBox, null, new String[0]);
        getCollisionBox.instructions = new InsnList();
        getCollisionBox.instructions.add(startLabel);
        getCollisionBox.instructions.add(new LineNumberNode(150, startLabel)); //Required

        AnnotationNode nullable = new AnnotationNode("Ljavax/annotation/Nullable;");
        nullable.values = Lists.newArrayList();
        getCollisionBox.visibleAnnotations = Lists.newArrayList(nullable);

        //TODO keep track of parameter changes between minecraft updates!
        LocalVariableNode lvnThis = new LocalVariableNode("this", "Lnet/minecraft/block/BlockLeaves;", null, startLabel, endLabel, 0);
        LocalVariableNode lvnPState = new LocalVariableNode("inState", "Lnet/minecraft/block/state/IBlockState;", null, startLabel, endLabel, 1);
        LocalVariableNode lvnPWorld = new LocalVariableNode("inWorld", "Lnet/minecraft/world/World;", null, startLabel, endLabel, 2);
        LocalVariableNode lvnPPos = new LocalVariableNode("inPos", "Lnet/minecraft/util/math/BlockPos;", null, startLabel, endLabel, 3);
        getCollisionBox.localVariables = Lists.newArrayList(lvnThis, lvnPState, lvnPWorld, lvnPPos);

        getCollisionBox.instructions.add(new FieldInsnNode(Opcodes.GETSTATIC, "net/minecraft/block/BlockLeaves", fieldNullAABB, "Lnet/minecraft/util/math/AxisAlignedBB;"));
        getCollisionBox.instructions.add(new InsnNode(Opcodes.ARETURN));
        getCollisionBox.instructions.add(endLabel);

        node.methods.add(getCollisionBox);

        /* ****************************************** *

        isPassable method construction

         * ****************************************** */

        startLabel = new LabelNode();
        endLabel = new LabelNode();
        MethodNode isPassable = new MethodNode(Opcodes.ACC_PUBLIC, methodNameIsPassable, methodDescIsPassable, null, new String[0]);
        isPassable.visibleAnnotations = Lists.newArrayList();
        isPassable.instructions = new InsnList();
        isPassable.instructions.add(startLabel);
        isPassable.instructions.add(new LineNumberNode(160, startLabel)); //Required

        //TODO keep track of parameter changes between minecraft updates!
        lvnThis = new LocalVariableNode("this", "Lnet/minecraft/block/BlockLeaves;", null, startLabel, endLabel, 0);
        lvnPState = new LocalVariableNode("inWorld", "Lnet/minecraft/world/IBlockAccess;", null, startLabel, endLabel, 1);
        lvnPPos = new LocalVariableNode("inPos", "Lnet/minecraft/util/math/BlockPos;", null, startLabel, endLabel, 2);
        isPassable.localVariables = Lists.newArrayList(lvnThis, lvnPState, lvnPPos);

        isPassable.instructions.add(new InsnNode(Opcodes.ICONST_1));
        isPassable.instructions.add(new InsnNode(Opcodes.IRETURN));
        isPassable.instructions.add(endLabel);

        node.methods.add(isPassable);

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        node.accept(writer);
        basicClass = writer.toByteArray();

        return basicClass;
    }

}
