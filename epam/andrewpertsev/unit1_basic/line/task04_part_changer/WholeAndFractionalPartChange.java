package epam.andrewpertsev.unit1_basic.line.task04_part_changer;

//4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

import java.util.Scanner;

public class WholeAndFractionalPartChange {
    public static void main(String[] args) {

        double beforeChange;
        double afterChange;
        double temp;

        beforeChange = enterFromConsole("Please, enter the value like nnn.ddd : ");
        if (beforeChange >= 1000) {
            throw new IllegalArgumentException(" Wrong number");
        }
        double roundBeforeChange = Math.floor(beforeChange*1000)/1000;


        temp = (int) roundBeforeChange;
        afterChange = temp / 1000 + (roundBeforeChange - temp) * 1000;


        System.out.println("Value Before Whole And Fractional Part Change : " + roundBeforeChange);
        System.out.printf("Value After Whole And Fractional Part Change : %.3f", afterChange);
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

