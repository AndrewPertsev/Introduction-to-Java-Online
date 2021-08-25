package epam.andrewpertsev.unit3_text.stringbuilder.task03_palindrome;

//3. Проверить, является ли заданное слово палиндромом

public class IsPalindrome {
    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "racecar";

        isBuilderPalindrome(word1);
        isBuilderPalindrome(word2);

        isCharPalindrome(word1);
        isCharPalindrome(word2);
    }



    public static boolean isCharPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2 & isPalindrome; i++) {

            isPalindrome = word.charAt(i) == word.charAt(word.length() - i - 1);

        }
        System.out.println("Is the word \"" + word + "\" palindrome? : " + isPalindrome);
        return isPalindrome;
    }




    public static void isBuilderPalindrome(String word) {
        String reverseWord;
        boolean isPalindrome;

        StringBuilder builder = new StringBuilder(word);

        reverseWord = builder.reverse().toString();
        isPalindrome = word.equals(reverseWord);

        System.out.println("Is the word \"" + word + "\" palindrome? : " + isPalindrome);


    }
}
