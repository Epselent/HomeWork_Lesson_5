package Task1;

public class FactoryLogger {
    public Logger createLogger(LoggerType typeLogger) {
        Logger logger = null;
        switch (typeLogger) {
            case CONSOLE:
                logger = new ConsoleLogger();
                break;
            case FILE:
                logger = new FileLogger();
                break;
            case DB:
                logger = new DbLogger();
                break;
        }
        return logger;
    }
}
