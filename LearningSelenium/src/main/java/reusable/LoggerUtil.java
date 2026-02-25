package reusable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    public static Logger getLogger(Class<?> clazz) {
        return LogManager.getLogger(clazz);
    }
}