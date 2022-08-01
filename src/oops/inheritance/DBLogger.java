package oops.inheritance;

public class DBLogger implements ILogger{
    public void log(String message) {
        System.out.printf("Writing to database: %s\n", message);
    }

    public void logInfo(String message) {
        System.out.printf("[INFO] Writing to database: %s\n", message);
    }

    public void logWarning(String message) {
        System.out.printf("[WARNING] Writing to database: %s\n", message);
    }

    public void logError(String message) {
        System.out.printf("[ERROR] Writing to database: %s\n", message);
    }
}
