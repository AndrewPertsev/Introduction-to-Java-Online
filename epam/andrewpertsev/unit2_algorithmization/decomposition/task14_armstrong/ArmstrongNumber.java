package epam.andrewpertsev.unit2_algorithmization.decomposition.task14_armstrong;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенных!!!! в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int k;
        List<Integer> arrayArmstrong;
        k = enterFromconsole("Please, enter high limit number : ");

        arrayArmstrong = findArmstrongNumbersFromInterval(k);

        printArrayList("Armstrong numbers array : ", arrayArmstrong);

    }

    public static List<Integer> findArmstrongNumbersFromInterval(int highLimit) {
        List<Integer> arrayArmstrong = new ArrayList<>();
        for (int i = 0; i < highLimit; i++) {
            if (calculateArmstrongFormula(i) == i) {
                arrayArmstrong.add(i);
            }
        }
        return arrayArmstrong;
    }

    public static int calculateArmstrongFormula(int number) {
        int sum = 0;
        int length;

        length = findLengthDigitMassive(number);

        while (number > 0) {
            int excess = number % 10;
            sum = sum + (int) Math.pow(excess, length);
            number = number / 10;
        }
        return sum;
    }

    public static int findLengthDigitMassive(int number) {
        int lengthMassive;
        lengthMassive = String.valueOf(number).length();
        return lengthMassive;
    }

    public static void printArrayList(String message, List<Integer> array) {
        System.out.println(message);
        array.forEach(System.out::println);
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

//1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54 748, 92 727, 93 084, 548 834, 1 741 725,
// 4 210 818, 9 800 817, 9 926 315, 24 678 050, 24 678 051, 88 593 477, 146 511 208, 472 335 975, 534 494 836,
// 912 985 153, 4 679 307 774.