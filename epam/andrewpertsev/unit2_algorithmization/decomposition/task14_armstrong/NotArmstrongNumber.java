package epam.andrewpertsev.unit2_algorithmization.decomposition.task14_armstrong;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная ("возведенных" по определению) в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

import java.util.Scanner;

public class NotArmstrongNumber {
    public static void main(String[] args) {
        int k;//2401 max
        int[] arrayArmstrong;
        k = enterFromconsole("Please, enter high limit number ; ");

        arrayArmstrong = findNotArmstrongNumbersFromInterval(k);

        printArray("Armstrong numbers array : ", arrayArmstrong);

    }

    public static int[] findNotArmstrongNumbersFromInterval(int highLimit) {
        int[] arrayArmstrong = new int[100];
        for (int i = 0, j = 0; i < highLimit; i++) {
            double sumNumberInPowLength = Math.pow(sumNumberToDigit(i), findLengthDigitMassive(i));
            if (sumNumberInPowLength == i) {
                arrayArmstrong[j] = i;
                j++;
            }
        }
        return arrayArmstrong;
    }

    public static int sumNumberToDigit(int number) {
        int sum = 0;
        while (number>0) {
            int massive = number % 10;
            sum = sum + massive;
            number = number / 10;
        }
        return sum;
    }

    public static int findLengthDigitMassive(int number) {
        int lengthMassive;
        lengthMassive = String.valueOf(number).length();
        return lengthMassive;
    }

    public static void printArray(String message, int[] matrix) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != 0) {
                System.out.print(matrix[i] + ", ");
            }
        }
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
}



