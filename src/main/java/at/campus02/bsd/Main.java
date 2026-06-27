package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(15, 3));
        System.out.println(calculator.subtract(15, 3));
        System.out.println(calculator.divide(15, 3));
        System.out.println(calculator.multiply(15, 3));
    }
}