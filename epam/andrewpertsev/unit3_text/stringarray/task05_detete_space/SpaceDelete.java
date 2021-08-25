package epam.andrewpertsev.unit3_text.stringarray.task05_detete_space;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class SpaceDelete {
    public static void main(String[] args) {
        String text = "     Space3   space2  space1 ";
        System.out.println("Initial text : " + text);
                                                         //  new String(text).trim().replaceAll("\\s+", " ")
        int quantitySpace = 0;
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                quantitySpace++;
                if (quantitySpace < 2)
                    result = result + text.charAt(i);
            } else {
                result += text.charAt(i);
                quantitySpace = 0;
            }
        }
        if (text.charAt(0) == ' ') {
            result = result.substring(1);
        }
        if (text.charAt(result.length()) == ' ') {
            result = result.substring(0, result.length() - 1);
        }

        System.out.println("Result text :" + result);
    }
}

