package Logging;

import java.io.IOException;
import java.util.logging.*;

public class SimpleLogging {
    static {
        String file = SimpleLogging.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", file);
    }

    private static Logger logger = Logger.getLogger("My Logger");

    public static void main(String[] args) throws IOException {
        /*logger.setUseParentHandlers(false); // Disable default handlers if needed
        Handler handler = new ConsoleHandler(); // Add custom handler
        logger.addHandler(handler);
        Handler fileHandler = new FileHandler("logs.log",false);
        logger.addHandler(fileHandler);*/
        /*SimpleFormatter simpleFormatter = new SimpleFormatter();
        handler.setFormatter(simpleFormatter);*/


        LogRecord logRecord = new LogRecord(Level.INFO, "This is a simple log");
        logger.log(logRecord);
    }
}
