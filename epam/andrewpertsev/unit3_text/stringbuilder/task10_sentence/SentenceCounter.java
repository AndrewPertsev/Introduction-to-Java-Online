package epam.andrewpertsev.unit3_text.stringbuilder.task10_sentence;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceCounter {
    public static void main(String[] args) {
        int count;
        int countB;
        String text = "Pattern Class: A pattern class represents the compiled regex. The Pattern class does not have any public constructors but it provides static compile () methods that return Pattern objects and can be used to create a pattern.\n" +
                "\n" +
                "Matcher Class: The Matcher class object matches the regex pattern to the string. Like Pattern class, this class also does not provide any public constructors. It provides the matcher () method that returns a Matcher object.\n" +
                "\n" +
                "PatternSyntaxException: This class defines an unchecked exception. An object of type PatternSyntaxException returns an unchecked exception indicating a syntax error in regex pattern.\n" +
                "\n" +
                "MatchResult Interface: The MatchResult interface determines the regex pattern matching result.";

        count = findSentenceQuantity(text);         //pattern version
        countB = findBuilderSentenceQuantity(text);   //stringbuilder version

        System.out.println("There are " + count + " sentences in the text");
        System.out.println("There are " + countB + " sentences in the text");


    }

    public static int findBuilderSentenceQuantity(String text) {
        int count = 0;
        StringBuilder builder = new StringBuilder(text);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.codePointAt(i) == '.' || builder.codePointAt(i) == '?' || builder.codePointAt(i) == '!') {
                count++;
            }
        }
        return count;
    }

    public static int findSentenceQuantity(String text) {
        int sentCount = 0;
        Pattern patternUpper = Pattern.compile("[.?!]");
        Matcher matcherUpper = patternUpper.matcher(text);
        while (matcherUpper.find()) {
            sentCount++;
        }
        return sentCount;
    }
}

