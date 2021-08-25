package epam.andrewpertsev.unit1_basic.line.task05_time_format;

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

import java.util.Scanner;

public class TimeLengthFormat {
    public static void main(String[] args) {

        int quantitySeconds = enterIntFromConsole(" Please, enter quantity of seconds : ");
        formatTimeLength(quantitySeconds);

    }
   public static void formatTimeLength(int quantitySeconds) {
        int hours;
        int minutes;
        int seconds;

        hours = quantitySeconds / 3600;
        minutes = (quantitySeconds % 3600) / 60;
        seconds = quantitySeconds % 60;
        System.out.println("Time Length Format : " + hours + "ч " + minutes + "мин " + seconds + "с.");
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

