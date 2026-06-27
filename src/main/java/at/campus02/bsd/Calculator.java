package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger LOGGER = LogManager.getLogger();

    public double add(double number1, double number2) {
        LOGGER.debug("Method add called with parameters number1: {} and number2: {}.", number1, number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        LOGGER.debug("Method subtract called with parameters number1: {} and number2: {}.", number1, number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            LOGGER.error("This is a division by zero error.");
            return 0;
        }

        LOGGER.debug("Method divide called with parameters number1: {} and number2: {}.", number1, number2);
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        LOGGER.debug("Method multiply called with parameters number1: {} and number2: {}.", number1, number2);
        return number1 * number2;
    }
}