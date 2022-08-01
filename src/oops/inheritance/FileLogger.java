package oops.inheritance;

public class FileLogger implements ILogger {
    public void log(String message) {
        System.out.printf("Writing to [log.txt]: %s\n", message);
    }

    public void logInfo(String message) {
        System.out.printf("[INFO] Writing to [log.txt]: %s\n", message);
    }

    public void logWarning(String message) {
        System.out.printf("[WARNING] Writing to [log.txt]: %s\n", message);
    }

    public void logError(String message) {
        System.out.printf("[ERROR] Writing to [log.txt]: %s\n", message);
    }
}
