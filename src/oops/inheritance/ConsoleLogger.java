package oops.inheritance;

public class ConsoleLogger implements ILogger, ITest {
    public void log(String message) {
        System.out.println(message);
    }

    public void logInfo(String message) {
        System.out.printf("[INFO]: %s\n", message);
    }

    public void logWarning(String message) {
        System.out.printf("[WARNING]: %s\n", message);
    }

    public void logError(String message) {
        System.out.printf("[ERROR]: %s\n", message);
    }

    public void doTest() {
        System.out.println("Doing test");
    }
}
