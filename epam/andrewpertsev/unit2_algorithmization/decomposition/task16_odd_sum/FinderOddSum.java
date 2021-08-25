package epam.andrewpertsev.unit2_algorithmization.decomposition.task16_odd_sum;

//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class FinderOddSum {
    public static void main(String[] args) {
        int capacity;
        int firstNumber;
        int secondNumber;
        int sumOfGenerated;
        int quantityEven;

        capacity = enterFromconsole(" Please, enter capacity of number : ");
        firstNumber = generateNumberFullOddDigits(capacity);
        secondNumber = generateNumberFullOddDigits(capacity);

        sumOfGenerated = sumGeneratedNumbers(firstNumber, secondNumber);
        quantityEven = countQuantityEvenDigitsInNumber(sumOfGenerated);

        System.out.println("Sum of generated numbers " + firstNumber + " and " + secondNumber + ",  sum = " + sumOfGenerated);
        System.out.println("There are " + quantityEven + " even number in the sum.");

    }

    public static int generateNumberFullOddDigits(int capacity) {
        int oddsNumber;
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < capacity) {
            oddsNumber = (int) (Math.random() * 10);
            if ((oddsNumber % 2) != 0) {
                builder.append(oddsNumber);
                i++;
            }
        }
        oddsNumber = valueOf(builder.toString());
        return oddsNumber;
    }

    public static int sumGeneratedNumbers(int firstNumber, int secondNumber) {
        int sum;
        sum = firstNumber + secondNumber;
        return sum;
    }

    public static int countQuantityEvenDigitsInNumber(int number) {
        int digit = 0;
        int excess;
        while (number > 0) {
            excess = number % 10;
            if (excess % 2 == 0) {
                digit++;
            }
            number = number / 10;
        }
        return digit;
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


//public static boolean checkIfNumbersFullOfOddDigits(int number) {
//        boolean isFullOddDigits = false;
//        int digit;
//        while (number > 0) {
//        isFullOddDigits = false;
//        digit = number % 10;
//        if (digit % 2 != 0) {
//        isFullOddDigits = true;
//        } else {
//        break;
//        }
//        number = number / 10;
//        }