package epam.andrewpertsev.unit3_text.stringarray.task01_snake_case;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

import java.util.Arrays;

public class SnakeCase {
    public static void main(String[] args) {

        String[] camelArray = {"maxNumber", "minNumber", "partOfWhole", "infinityArrayCycleProducer"};

        printArrayString("\nInitial CamelCase array : ", camelArray);
        printArrayString("\nSnakeCase array : ", CamelToSnakeShifter(camelArray));
    }


    public static String[] CamelToSnakeShifter(String[] camelArray) {
        char[] charArray;
        String[] snakeArray = new String[camelArray.length];
        Arrays.fill(snakeArray,"");

        for (int i = 0; i < camelArray.length; i++) {
            charArray = camelArray[i].toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (Character.isUpperCase(charArray[j])) {
                    snakeArray[i] += "_" + Character.toLowerCase(charArray[j]);

                } else {
                    snakeArray[i] += charArray[j];
                }
            }
        }
        return snakeArray;
    }

    public static void printArrayString(String message, String[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}
