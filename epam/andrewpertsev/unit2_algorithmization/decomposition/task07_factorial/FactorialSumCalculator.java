package epam.andrewpertsev.unit2_algorithmization.decomposition.task07_factorial;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

import java.util.Scanner;

public class FactorialSumCalculator {
    public static void main(String[] args) {
        int number = 9 ;                //int number = enterIntFromConsole(" Please, enter the max number : ");

        FactorialSumCalculator calculator = new FactorialSumCalculator(number);
        System.out.println(" Sum of factorials ODD numbers up to " + number + " = " + calculator.calculateSumOddFactorial(number));
    }

    public FactorialSumCalculator(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number should be greater than 0");
        }
    }

    public static int calculateSumOddFactorial(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += findFactorial(i);
        }
        return sum;
    }

    public static int findFactorial(int number) {
        int factorial=1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int enterIntFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextInt();
        return value;

    }
}
