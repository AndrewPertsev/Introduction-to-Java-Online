package epam.andrewpertsev.unit1_basic.cycle.task07_divisor_interval;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class DivisorsFromInterval {
    public static void main(String[] args) {

        int mPoint = enterFromConsole(" Please, enter the first number \"m\" :");
        int nPoint = enterFromConsole(" Please, enter the second number \"n\" :");

        divisorsFromInterval(mPoint, nPoint);

    }

    public static void divisorsFromInterval(int mPoint, int nPoint) {
        boolean isDivisor = false;

        for (int i = mPoint; i <= nPoint; i++) {
            System.out.print(" Number " + i + " has divisors: ");
            for (int divisor = 2; divisor <= nPoint / 2; divisor++) {
                if (i == divisor) {
                    continue;
                }
                if (i % divisor == 0) {
                    isDivisor = true;
                    System.out.print(" " + divisor + " ");
                }
            }
            if (isDivisor == false) {
                System.out.print(" divisors are absent.");
            }
            System.out.println();
            isDivisor = false;
        }
    }

    public static int enterFromConsole(String message) {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextInt();

        return value;
    }

}