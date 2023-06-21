package me.elordenador.javautils;


public class OSUtils {
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