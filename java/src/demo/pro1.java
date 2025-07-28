package demo;

class Calculator {

    // Method to calculate power for integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method to calculate power for double base and int exponent
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class pro1 {
    public static void main(String[] args) {
        // Testing powerInt method
        int result1 = Calculator.powerInt(2, 3); // 2^3 = 8
        System.out.println("2^3 = " + result1);

        // Testing powerDouble method
        double result2 = Calculator.powerDouble(2.5, 2); // 2.5^2 = 6.25
        System.out.println("2.5^2 = " + result2);
    }
}
