package epam.andrewpertsev.unit3_text.stringbuilder.task07_deletedouble;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//       def", то должно быть выведено "abcdef".

public class FilterString {
    public static void main(String[] args) {
        String filteredString;
        String text = "abc cde def   12345654332345533111111111540";

        filteredString = textCharsSet(text);

        System.out.println(filteredString);

    }

    public static String textCharsSet (String text) {
        StringBuilder builder = new StringBuilder(text);

        for (int i = 0; i < builder.length(); i++) {
            for (int j = i + 1; j < builder.length(); j++) {
                if ((builder.charAt(i) == builder.charAt(j)) || (builder.charAt(j) == ' ')) {
                    builder.deleteCharAt(j);
                    j--;
                }
            }
        }

        return builder.toString();
    }
}
