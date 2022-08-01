package oops.inheritance;

public interface ILogger {
    void log(String message);

    void logError(String message);

    void logInfo(String message);

    void logWarning(String message);

    default void init(){
        System.out.println("Initializing logger");
    }
}
