package epam.andrewpertsev.unit3_text.stringbuilder.task05_lettercount;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class LetterCounter {
    public static void main(String[] args) {
        char letter = 'a';
        int quantityLetters;
        String text = "Initially, it was named as “Oak” but was renamed subsequently in 1995 as “Java” since Oak was already a registered trademark.";

        quantityLetters = findQuantityLetter(text, letter);

        System.out.println("Text : " + text);
        System.out.println("\nFound in the text " + quantityLetters + " letters \"" + letter + "\".");

    }

    public static int findQuantityLetter(String text, char letter) {
        int count = 0;

        StringBuilder builder = new StringBuilder(text);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == letter) {
                {
                    count++;
                }
            }
        }
        return count;
    }
}
