package epam.andrewpertsev.unit1_basic.line.task02_function_pow;

//2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//        𝑏 + √𝑏2 + 4𝑎𝑐
//        2𝑎 − 𝑎3𝑐 + 𝑏−2

import java.util.Scanner;

public class ValueOfFunctionPow {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double valueOfFunctionPow;

        a = enterFromConsole("Please, enter the number \"a\", except 0:");
        if (a == 0) {
            throw new IllegalArgumentException(" Number \"a\", should be except 0.");
        }
        b = enterFromConsole("Please, enter the number \"b\"");
        c = enterFromConsole("Please, enter the number \"c\"");


        valueOfFunctionPow = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + 1 / b * b);
        System.out.println(" Value Of Function Pow = " + valueOfFunctionPow);
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


