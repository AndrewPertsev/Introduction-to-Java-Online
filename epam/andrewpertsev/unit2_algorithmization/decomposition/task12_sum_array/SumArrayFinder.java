package epam.andrewpertsev.unit2_algorithmization.decomposition.task12_sum_array;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.ArrayList;
import java.util.List;

public class SumArrayFinder {
    public static void main(String[] args) {
        int sumNumber = 4;
        int maxNumber = 50;
        List<Integer> array;

        SumArrayFinder finder = new SumArrayFinder(sumNumber, maxNumber);
        array = finder.createSumKMassive(sumNumber, maxNumber);

        printArrayInt("Result massive : \n", array);

    }

    public SumArrayFinder(int sumNumber, int maxNumber) {
        if (maxNumber < sumNumber) {
            throw new IllegalArgumentException(" MaxNumber should be greater than SumNumber");
        }
    }

    public List<Integer> createSumKMassive(int sumNumber, int maxNumber) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < maxNumber; i++) {
            if (findSumOfDigits(i) == sumNumber) {
                array.add(i);
            }
        }
        return array;
    }

    public int findSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void printArrayInt(String message, List<Integer> array) {
        System.out.print(message);
        array.forEach(System.out::println);
    }
}

