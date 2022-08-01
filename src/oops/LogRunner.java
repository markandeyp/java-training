package oops;

import oops.inheritance.ConsoleLogger;
import oops.inheritance.DBLogger;
import oops.inheritance.FileLogger;
import oops.inheritance.ILogger;

public class LogRunner {
    public static void main(String[] args) {
        ILogger cLogger = new ConsoleLogger();
        ILogger fLogger = new FileLogger();
        ILogger dbLogger = new DBLogger();

        cLogger.init();
        cLogger.logInfo("Interfaces are the best");

        fLogger.init();

        fLogger.logInfo("Interfaces are the best");
        dbLogger.logInfo("Interfaces are the best");
    }
}
