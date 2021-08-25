package epam.andrewpertsev.unit2_algorithmization.decomposition.task10_split_array;

//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

import java.util.Scanner;

public class SplitIntArray {
    public static void main(String[] args) {
        int number;
        int[] massive;

        number = enterFromconsole("Please, enter the number to convert : ");

        SplitIntArray splitter = new SplitIntArray();
        massive = splitter.convertNumberToDigitMassive(number);

        printArray(" Converted massive : ", massive);
    }

    public static int[] convertNumberToDigitMassive(int number) {
        int lengthMassive;
        lengthMassive = String.valueOf(number).length();
        int[] massive = new int[lengthMassive];

        for (int j = lengthMassive-1; j >= 0; j--) {
            massive[j] = number % 10;
            number = number / 10;
        }
        return massive;
    }


    public static int enterFromconsole(String message) {
        System.out.println(message);
        int value;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }
        value = scanner.nextInt();
        return value;
    }

    public static void printArray(String message, int[] matrix) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + ", ");

        }
    }
}