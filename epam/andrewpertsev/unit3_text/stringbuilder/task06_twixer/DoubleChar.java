package epam.andrewpertsev.unit3_text.stringbuilder.task06_twixer;

//6. Из заданной строки получить новую, повторив каждый символ дважды

public class DoubleChar {
    public static void main(String[] args) {
        String doubleText;
        String text = "hello Java";

        doubleText = appearTextDouble(text);

        System.out.println("Input text : " + text);
        System.out.println("Double text : " + doubleText);
    }

    public static String appearTextDouble(String text) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            builder.append(text.charAt(i));
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}