package epam.andrewpertsev.unit3_text.stringbuilder.task08_longword;

//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

public class LongestWordFinder {
    public static void main(String[] args) {
        String text = "Initially , it was named as “Oak” but  was renamed subsequently in 1995 as “Java” since Oak was already a registered trademark.";

        findLongestWordInText(text);

    }

    public static void findLongestWordInText(String text) {
        int length;
        int maxLength = 1;
        int indexMax = 0;
        int count = 1;

        String[] array = text.split("\\s+");

        for (int i = 0; i < array.length; i++) {
            length = String.valueOf(array[i]).length();
            if (length > maxLength) {
                maxLength = length;
                indexMax = i;
            } else if (length == maxLength) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println(" More thah 2 words with max length");

        } else {
            System.out.println("Max length has word \"" + array[indexMax] + "\" , its length = " + maxLength + " symbols, and index = " + indexMax);
        }
    }
}
// List<String> wordArray = new ArrayList<>(text.split(" "));
// Collections.sort(wordArray, new StringLengthComparator());


