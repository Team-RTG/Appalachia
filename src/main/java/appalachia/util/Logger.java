package appalachia.util;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;

import net.minecraftforge.fml.common.FMLLog;

import appalachia.config.appalachia.ConfigAppalachia;
import org.apache.logging.log4j.Level;


public class Logger {

    public static void debug(String format, Object... data) {

        if (ConfigAppalachia.enableDebugging) {
            FMLLog.log(Level.INFO, "[Appalachia-DEBUG] " + format, data);
        }
    }

    public static void info(String format, Object... data) {

        FMLLog.log(Level.INFO, "[Appalachia-INFO] " + format, data);
    }

    public static void warn(String format, Object... data) {

        FMLLog.log(Level.WARN, "[Appalachia-WARN] " + format, data);
    }

    public static void error(String format, Object... data) {

        FMLLog.log(Level.ERROR, "[Appalachia-ERROR] " + format, data);
    }

    public static void fatal(String message, Throwable throwable, Object... data) {

        FMLLog.log(Level.FATAL, "[Appalachia-FATAL] " + message, data);
        Minecraft.getMinecraft().crashed(new CrashReport(message, throwable));
    }
}