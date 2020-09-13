package Task1;

public class Calculator {
    private double x;
    private double y;
    private FactoryLogger factoryLogger = new FactoryLogger();

    private void log(String message) {
        for (LoggerType a : LoggerType.values()) {
            Logger logger = factoryLogger.createLogger(a);
            logger.log(message);
        }
    }

    public void addition(double x, double y) {
        log("Сумма чисел равна " + (x + y));
    }

    public void subtraction(double x, double y) {
        log("Вычитание равно " + (x - y));
    }

    public void multiplication(double x, double y) {
        log("Произведение чисел равно " + (x * y));
    }

    public void division(double x, double y) {
        log("Деление чисел равно " + (x / y));
    }
}
