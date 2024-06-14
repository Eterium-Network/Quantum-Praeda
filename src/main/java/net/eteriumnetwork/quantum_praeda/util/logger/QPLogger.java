package net.eteriumnetwork.quantum_praeda.util.logger;

import net.eteriumnetwork.quantum_praeda.QuantumPraeda;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Constants;

public class QPLogger {
    private static final String LOGGER_PREFIX = QuantumPraeda.MODID;
    private static final Logger SERVER = LogManager.getLogger(LOGGER_PREFIX + "/Server");
    private static final Logger CLIENT = LogManager.getLogger(LOGGER_PREFIX + "/Client");

    private static boolean logEnabled = true;
    private static boolean debugLogEnabled = true;
    private static boolean craftingLogEnable = false;
    private static boolean gridLogEnable = false;

    private QPLogger() {}

    /**
     * Returns the appropriate logger instance for the current environment (server/client).
     *
     * @return a Logger instance.
     */
    private static Logger getLogger() {
        return isSever() ? SERVER : CLIENT;
    }

    /**
     * Determines if the current environment is a server.
     *
     * @return true if the current environment is a server, false otherwise.
     */
    private static boolean isSever() {
        return true;
    }

    /**
     * Logs a message with the specified logger level.
     *
     * @param level   the logger level.
     * @param message the message to logger.
     * @param params  the parameters to format the message.
     */
    public static void log(Level level, String message, Object... params) {
        if(isLogEnabled()) {
            Logger logger = getLogger();
            String formatedMessage = applyColor(level, String.format(message, params));
            logger.log(level, formatedMessage);
        }
    }

    private static String applyColor(Level level, String message) {
        if (!Constants.ENABLE_THREADLOCALS) {
            return message;  // Coloring is not supported in this environment
        }
        String colorCode = switch (level.getStandardLevel()) {
            case ERROR -> "\u001B[31m"; // Red
            case WARN -> "\u001B[33m"; // Yellow
            case INFO -> "\u001B[32m"; // Green
            case DEBUG -> "\u001B[34m"; // Blue
            default -> "\u001B[0m"; // Reset
        };
        return colorCode + message + "\u001B[0m";
    }

    /**
     * Checks if logging is globally enabled.
     *
     * @return true if logging is enabled, false otherwise.
     */
    public static boolean isLogEnabled() {
        return logEnabled;
    }

    /**
     * Checks if debug logging is enabled.
     *
     * @return true if debug logging is enabled, false otherwise.
     */
    public static boolean isDebugLogEnabled() {
        return debugLogEnabled;
    }

    /**
     * Checks if crafting logging is enabled.
     *
     * @return true if crafting logging is enabled, false otherwise.
     */
    public static boolean isCraftingLogEnable() {
        return craftingLogEnable;
    }

    /**
     * Checks if grid logging is enabled.
     *
     * @return true if grid logging is enabled, false otherwise.
     */
    public static boolean isGridLogEnable() {
        return gridLogEnable;
    }

    /**
     * Logs an informational message.
     *
     * @param format the message format.
     * @param params the parameters to format the message.
     */
    public static void info(String format, Object... params) {
        log(Level.INFO, format, params);
    }

    /**
     * Logs a warning message.
     *
     * @param format the message format.
     * @param params the parameters to format the message.
     */
    public static void warn(String format, Object... params) {
        log(Level.WARN, format, params);
    }

    /**
     * Logs an error message.
     *
     * @param format the message format.
     * @param params the parameters to format the message.
     */
    public static void error(String format, Object... params) {
        log(Level.ERROR, format, params);
    }

    /**
     * Logs a debug message if debug logging is enabled.
     *
     * @param format the message format.
     * @param params the parameters to format the message.
     */
    public static void debug(String format, Object... params) {
        if (isDebugLogEnabled()) {
            log(Level.DEBUG, format, params);
        }
    }

    /**
     * Logs a block update message.
     *
     * @param message the message to logger.
     * @param params  the parameters to format the message.
     */
    public static void blockUpdateLog(String message, Object... params) {
        info(message, params);
    }

    /**
     * Logs a crafting-related message if crafting logging is enabled.
     *
     * @param message the message to logger.
     * @param params  the parameters to format the message.
     */
    public static void craftingLog(String message, Object... params) {
        if (isCraftingLogEnable()) {
            info(message, params);
        }
    }

    /**
     * Logs a grid-related message if grid logging is enabled.
     *
     * @param message the message to logger.
     * @param params  the parameters to format the message.
     */
    public static void gridLog(String message, Object... params) {
        if (isGridLogEnable()) {
            info(message, params);
        }
    }

    /**
     * Enables or disables debug logging.
     *
     * @param enabled true to enable debug logging, false to disable.
     */
    public static void setDebugLogEnabled(boolean enabled) {
        debugLogEnabled = enabled;
    }

    /**
     * Enables or disables crafting logging.
     *
     * @param enabled true to enable crafting logging, false to disable.
     */
    public static void setCraftingLogEnabled(boolean enabled) {
        craftingLogEnable = enabled;
    }

    /**
     * Enables or disables grid logging.
     *
     * @param enabled true to enable grid logging, false to disable.
     */
    public static void setGridLogEnabled(boolean enabled) {
        gridLogEnable = enabled;
    }
}
