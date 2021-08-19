package me.sanyasho.ncalc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import static me.sanyasho.ncalc.NCalcMain.srclink;
import static me.sanyasho.ncalc.NCalcMain.year;
import me.sanyasho.ncalc.NCalcMain.*;

public class NCalcPreMain {
    
    public static final String userhome = System.getProperty("user.home");
    public static final String fileseparator = System.getProperty("file.separator");
    public static final String datadir = userhome + fileseparator + ".ncalc-data" + fileseparator;
    
    public static void main(String args[]) {
        
        // Create DataDir
        File appdir = new File(datadir);
        if (!appdir.exists()) {
            try {
                appdir.mkdir();
            } catch(SecurityException se) {
                System.out.println("[PREMAIN] -> [DATADIR] -> " + se);
            }
        }
        
        // Create Config
        File configfile = new File(datadir + "config.yml");
        if (!configfile.exists()) {
            try {
                configfile.createNewFile();
            } catch(SecurityException | IOException se) {
                System.out.println("[PREMAIN] -> [CFG] -> " + se);
            }
        }
        
        // Mount Config
        Properties conffile = new Properties();
        try {
            conffile.load(new FileInputStream(datadir + "config.yml"));
        } catch(IOException ex) {
            System.out.println("[PREMAIN] -> " + ex);
        }
        
        // IF Config File is Empty -> Write simple data
        if(conffile.isEmpty()) {
            Properties writeconfigfile = new Properties();
            try {
                writeconfigfile.setProperty("lang", "en_US");
                writeconfigfile.setProperty("defmode", "1");
                writeconfigfile.store(new FileOutputStream(datadir + "config.yml"), null);
            } catch (FileNotFoundException ex) {
                System.out.println("[PREMAIN] -> " + ex);
            } catch (IOException ex) {
                System.out.println("[PREMAIN] -> [FATAL] -> " + ex);
            }
        }
        
        // Mount en_US language file.
        Properties enus = new Properties();
        try {
            enus.load(NCalcMain.class.getResourceAsStream("/lang/en_US.properties"));
        } catch(IOException ex) {
            System.out.println("[PREMAIN] -> [FATAL] -> " + ex);
        }
        
        // Mount ru_RU language file.
        Properties ruru = new Properties();
        try {
            ruru.load(NCalcMain.class.getResourceAsStream("/lang/ru_RU.properties"));
        } catch(IOException ex) {
            System.out.println("[PREMAIN] -> [FATAL] -> " + ex);
        }
        
        // Mount MISC file.
        Properties misc = new Properties();
        try {
            misc.load(NCalcMain.class.getResourceAsStream("/lang/misc.properties"));
        } catch(IOException ex) {
            System.out.println("[PREMAIN] -> [FATAL] -> " + ex);
        }
        
        // Debug
        if(conffile.getProperty("lang").startsWith("en_US")) {
            System.out.println("[PREMAIN] -> " + "Language: " + conffile.getProperty("lang"));
        }
        
        // Debug
        if(conffile.getProperty("lang").startsWith("ru_RU")) {
            System.out.println("[PREMAIN] -> " + "Язык: " + conffile.getProperty("lang"));
        }
        
        // Copyright ENUS
        if(conffile.getProperty("lang").startsWith("en_US")) {
            System.out.println("====================================================");
            System.out.println("Copyright " + misc.getProperty("ncalcauthor") + " " + year + ". All right reserved.");
            System.out.println("Source code: " + srclink);
            System.out.println("Version: " + misc.getProperty("ncalcver"));
            System.out.println("Language: " + conffile.getProperty("lang"));
            System.out.println("====================================================");
        }
        
        // Copyright RURU
        if(conffile.getProperty("lang").startsWith("ru_RU")) {
            System.out.println("====================================================");
            System.out.println("Копирайт " + misc.getProperty("ncalcauthor") + " " + year + ". Все права защищены.");
            System.out.println("Исходный код: " + srclink);
            System.out.println("Версия: " + misc.getProperty("ncalcver"));
            System.out.println("Язык: " + conffile.getProperty("lang"));
            System.out.println("====================================================");
        }
        
        // Launch
        new NCalcMain().setVisible(true);
        
        // ???
        // NOT A DEBUG
        if(conffile.getProperty("lang").startsWith("20140626")) {
            System.out.println("[1.7.10 is not the best] -> " + "1.7.10 is not the best");
        }
        
        // NOT A COPYRIGHT
        if(conffile.getProperty("lang").startsWith("20140626")) {
            System.out.println("====================================================");
            System.out.println("1.7.10 is not the best " + "1.7.10 is not the best" + " " + "1.7.10 is not the best" + " 1.7.10 is not the best");
            System.out.println("1.7.10 is not the best " + "1.7.10 is not the best");
            System.out.println("1.7.10 is not the best " + "1.7.10 is not the best");
            System.out.println("1.7.10 is not the best " + "1.7.10 is not the best");
            System.out.println("====================================================");
        }
    }
}
