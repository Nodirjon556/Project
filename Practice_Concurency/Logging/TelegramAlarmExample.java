package Logging;

import Logging.a.A;

import java.util.Random;
import java.util.logging.*;

public class TelegramAlarmExample {
    static {
        String file = SimpleLogging.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", file);
    }

    private static Logger logger = Logger.getLogger(TelegramAlarmExample.class.getName());

    public static void main(String[] args) {
        /*Handler handler = new TelegramAlarmHandler(); // handler ochmasdan logging.propertiesga qushib quyish orqali qilindi
        logger.addHandler(handler);*/
        try {
            if (new Random().nextBoolean())
                throw new RuntimeException("RunTimeException for alarm tests");
            else new A().a();
        }catch (RuntimeException e){
            e.printStackTrace();
            logger.log(Level.SEVERE,"Error message for Telegram",e);
        }
    }
}
