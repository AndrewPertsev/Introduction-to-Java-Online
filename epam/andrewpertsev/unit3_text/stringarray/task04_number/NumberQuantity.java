package epam.andrewpertsev.unit3_text.stringarray.task04_number;

//3. В строке найти количество чисел

public class NumberQuantity {
    public static void main(String[] args) {
        int quantityNumbers = 0;
        String sentence = "8 word88 hello888 word bye8888";
        quantityNumbers = findNumberQuantityInText(sentence);

        System.out.println("Sentence : " + sentence);
        System.out.println("Quantity of numbers : " + quantityNumbers);
    }

    public static int findNumberQuantityInText(String sentence) {
        int quantityNumbers = 0;
        char[] charArray = sentence.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                quantityNumbers++;
                while (Character.isDigit(charArray[i++]) & i < charArray.length) {

                }
            }
        }
        return quantityNumbers;
    }
}
