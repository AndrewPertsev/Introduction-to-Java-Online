package epam.andrewpertsev.unit3_text.stringbuilder.task01_maxspace;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class MaxSpaceFinder {
    public static void main(String[] args) {
        int count = 0;
        int maxQuantity = 0;
        String text = "Initially, it 5spaces:     was named as “Oak” but  was renamed subsequently in 1995 as “Java” since Oak was already a registered trademark.";

        StringBuilder builder = new StringBuilder(text);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                {
                    count++;
                }
                if (count > maxQuantity) {
                    maxQuantity = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println("Max quantity spaces in a row : " + maxQuantity);

    }
}
