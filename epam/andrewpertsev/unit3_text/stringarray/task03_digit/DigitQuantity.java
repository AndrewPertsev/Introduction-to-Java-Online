package epam.andrewpertsev.unit3_text.stringarray.task03_digit;

//3. В строке найти количество цифр.

public class DigitQuantity {
    public static void main(String[] args) {
        String sentence = "wo2rd hello6 world bye 6";
        int count = 0;
        boolean isDigit;

        char[] sentenceArray = sentence.toCharArray();

        for (int i = 0; i < sentenceArray.length; i++) {
            isDigit = Character.isDigit(sentenceArray[i]);
            if (isDigit) {
                count++;
            }
        }
        System.out.println("Quantity of digits in the string : "+ count);
    }
}
