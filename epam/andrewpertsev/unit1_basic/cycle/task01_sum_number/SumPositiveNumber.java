package epam.andrewpertsev.unit1_basic.cycle.task01_sum_number;

//1.Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class SumPositiveNumber {
    public static void main(String[] args) {

        new SumPositiveNumber(enterIntFromConsole(" Please, enter the positive int number : "));

    }

    public SumPositiveNumber(int number) {
        if (number<0) {throw new IllegalArgumentException(" Number should be positive.");}
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of positive numbers is : " + sum);
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
