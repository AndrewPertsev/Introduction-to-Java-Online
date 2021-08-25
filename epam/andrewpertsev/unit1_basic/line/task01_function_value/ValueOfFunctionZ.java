package epam.andrewpertsev.unit1_basic.line.task01_function_value;

//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class ValueOfFunctionZ {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double valueOfFunctionZ;

        a = enterFromConsole("Please, enter the number \"a\"");
        b = enterFromConsole("Please, enter the number \"b\"");
        c = enterFromConsole("Please, enter the number \"c\"");

        valueOfFunctionZ = (((a - 3) * b / 2) + c);
        System.out.println(" Value Of Function z=" + valueOfFunctionZ);
    }

    public static double enterFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        double value;
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextDouble();
        return value;

    }
}
