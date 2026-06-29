package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        while(true) {
            logger.trace("Trace messages");
            logger.debug("Debug messages");
            logger.info("Info messages");
            logger.warn("Warning messages");
            logger.error("Error messages");
        }
    }
}
