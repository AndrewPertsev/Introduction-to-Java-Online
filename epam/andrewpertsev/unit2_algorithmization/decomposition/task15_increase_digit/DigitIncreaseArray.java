package epam.andrewpertsev.unit2_algorithmization.decomposition.task15_increase_digit;

//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitIncreaseArray {
    public static void main(String[] args) {
        int capacity;
        List<Integer> arrayResult;

        capacity = enterFromconsole("Please enter digit capacity : ");

        arrayResult = makeArrayNumberWithIncreaseDigits(capacity);

        printArrayList("Result amount of numbers : ", arrayResult);
    }

    public static int determineUpperBound(int n) {
        int upperBound = (int) Math.pow(10, n);
        return upperBound;
    }

    public static int determineLowBound(int n) {
        int lowerBound = (int) Math.pow(10, n - 1);
        return lowerBound;
    }


    public static List<Integer> makeArrayNumberWithIncreaseDigits(int n) {
        int lowerBound;
        int upperBound;
        boolean isIncrease;
        int[] arrayNumber;
        List<Integer> arrayResult = new ArrayList<>();

        lowerBound = determineLowBound(n);
        upperBound = determineUpperBound(n);

        for (int i = lowerBound; i < upperBound; i++) {
            arrayNumber = convertNumberToDigitMassive(i);
            isIncrease = false;
            for (int j = 0; j < arrayNumber.length - 1; j++) {
                if (arrayNumber[j] < arrayNumber[j + 1]) {
                    isIncrease = true;
                } else {
                    isIncrease = false;
                    break;
                }
            }
            if (isIncrease) {
                arrayResult.add(i);
            }
        }

        return arrayResult;
    }


    public static int[] convertNumberToDigitMassive(int number) {
        int lengthMassive;
        lengthMassive = String.valueOf(number).length();
        int[] massive = new int[lengthMassive];

        for (int j = lengthMassive - 1; j >= 0; j--) {
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

    public static void printArrayList(String message, List<Integer> arrayResult) {
        System.out.println(message);
        arrayResult.forEach(System.out::println);


    }
}