package epam.andrewpertsev.unit3_text.stringbuilder.task09_case_counter;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaseCounter {
    public static void main(String[] args) {
        String text = "Initially , it was named as “Oak” but  was renamed subsequently in 1995 as “Java” since Oak was already a registered trademark.";

        int upperCount ;
        int upperB ;
        int lowerCount ;
        int lowerB ;

        upperCount = findQuantityUpperCase(text);   //pattern version
        lowerCount = findQuantityLowerCase(text);

        upperB = findUpperCaseBuilderQuantity(text); // stringbuilder version
        lowerB = findLowerCaseBuilderQuantity(text);



        System.out.println("Quantity of Uppercase symbols : " + upperCount);
        System.out.println("Quantity of Lowercase symbols : " + lowerCount);

        System.out.println("BuilderQuantity of Uppercase symbols : " + upperB);
        System.out.println("BuilderQuantity of Lowercase symbols : " + lowerB);

    }

    public static int findUpperCaseBuilderQuantity(String text) {
        int upperB = 0;
        StringBuilder builder = new StringBuilder(text);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.codePointAt(i) >= 'A' & builder.codePointAt(i) <= 'Z') {
                upperB++;
            }
        }
        return upperB;
    }

    public static int findLowerCaseBuilderQuantity(String text) {
        int lowerB = 0;
        StringBuilder builder = new StringBuilder(text);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.codePointAt(i) >= 'a' & builder.codePointAt(i) <= 'z') {
                lowerB++;
            }
        }
        return lowerB;
    }


    public static int findQuantityUpperCase(String text) {
        int upperCount = 0;
        Pattern patternUpper = Pattern.compile("[A-Z]");
        Matcher matcherUpper = patternUpper.matcher(text);
        while (matcherUpper.find()) {
            upperCount++;
        }
        return upperCount;
    }

    public static int findQuantityLowerCase(String text) {
        int lowerCount = 0;
        Pattern patternLower = Pattern.compile("[a-z]");
        Matcher matcherLower = patternLower.matcher(text);
        while (matcherLower.find()) {
            lowerCount++;
        }
        return lowerCount;
    }


}

