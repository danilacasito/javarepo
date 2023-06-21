package me.elordenador.javautils;

/**
 * This class is used for some Operating System utilities
 * @author elordenador
 */
public class OSUtils {
    /**
     * This static method can be used to identify the OS that the user is using.
     * @version 0.1
     * @return String
     */
    public static String getOS() {
        String OS = System.getProperty("os.name", "generic").toLowerCase();
        
        if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
            return "MacOS";
        } else if (OS.indexOf("win") >= 0) {
            return "Windows";
        } else if (OS.indexOf("nux") >= 0) {
            return "Linux";
        } else {
            return "OtherOS";
        }
        
    }
}