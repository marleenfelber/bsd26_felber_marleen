package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info("This is an info message.");

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(15, 3));
        System.out.println(calculator.subtract(15, 3));
        System.out.println(calculator.divide(15, 3));
        System.out.println(calculator.multiply(15, 3));
        System.out.println("Marleen Felber");

        LOGGER.error("This is an error.");
    }
}