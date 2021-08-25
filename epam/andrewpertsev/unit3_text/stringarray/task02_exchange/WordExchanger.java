package epam.andrewpertsev.unit3_text.stringarray.task02_exchange;

//2. Замените в строке все вхождения 'word' на 'letter'.

import java.util.ArrayList;
import java.util.List;

public class WordExchanger {
    public static void main(String[] args) {
        String sentence = "word, is  the  word \"www\" contains wordwordword";
        String wordOff = "word";
        String insertWord = "letter";
        char[] sentenceArray = sentence.toCharArray();
        char[] wordOffArray = wordOff.toCharArray();
        char[] insertWordArray = insertWord.toCharArray();
        char[] exchangedArray;

        exchangedArray = exchangeWord(sentenceArray, wordOffArray, insertWordArray);

        System.out.println("Initial sentence : " + sentence);
        printArrayChar("\nModified array : ", exchangedArray);

    }

    public static List<Integer> findWord(char[] sentenceArray, char[] wordOffArray) {
        boolean isWordInSentence;
        List<Integer> indexWordOff = new ArrayList<>();

        if (sentenceArray.length == 0 || wordOffArray.length == 0) {
            throw new IllegalArgumentException(" Sentence or word too short");
        }

        for (int i = 0; i < sentenceArray.length - wordOffArray.length + 1; i++) {
            for (int j = 0; j < sentenceArray.length; j++) {
                if (sentenceArray[i] == wordOffArray[j] & sentenceArray[i + 1] == wordOffArray[j + 1]) {
                    isWordInSentence = false;
                    for (int k = 0; k < wordOffArray.length; k++) {
                        if (sentenceArray[i + k] != wordOffArray[k]) {
                            break;
                        } else {
                            isWordInSentence = true;
                        }
                    }
                    if (isWordInSentence) {
                        indexWordOff.add(i);

                    }
                }
                if (sentenceArray[i] != wordOffArray[j]) {
                    break;
                }
            }
        }
        if (indexWordOff.size() == 0) {
            System.out.println("\nThere isn't such word in the sentence.");
        }
        return indexWordOff;
    }

    public static char[] exchangeWord(char[] sentenceArray, char[] wordOffArray, char[] insertWordArray) {
        List<Integer> indexWordOff;
        Integer[] indMassive;
        int difference;
        char[] modifiedArray;

        indexWordOff = findWord(sentenceArray, wordOffArray);
        indMassive = indexWordOff.toArray(new Integer[0]);

        difference = insertWordArray.length - wordOffArray.length;
        modifiedArray = new char[sentenceArray.length + indMassive.length * difference];

        for (int i = 0, k = 0, j = 0; i < modifiedArray.length; i++) {
            if (indMassive[j] > i | indMassive[j] < i) {
                modifiedArray[i] = sentenceArray[k];
                k++;
            }
            if (indMassive[j] == i) {
                for (int n = 0; n < insertWordArray.length; n++) {
                    modifiedArray[i] = insertWordArray[n];
                    i++;
                }

                if (j < indMassive.length - 1) {
                    j++;
                    indMassive[j] = indMassive[j] + j * difference;
                }
                i = i - 1;
                k = k + insertWordArray.length - difference;

            }
        }
        return modifiedArray;
    }


    public static void printArrayChar(String message, char[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i]);
        }
    }
}
//         Integer[] indMassive = new Integer[indexWordOff.size()];
//          indexWordOff.toArray(indMassive);////////////////////
//        int[] indMassive = new int[indexWordOff.size()];
//        for (int i = 0; i < indMassive.length; i++) {
//            indMassive[i] = Integer.valueOf(indexWordOff.get(i));//  int[] indexMassive = {9, 29, 33, 37};
//        }////////////////////
//        Object[] indMassive =indexWordOff.toArray();

//    public static void main(String[] args) {
//        String sentence = "6word wordwordwordwordtowordwordwordword wording wordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordtowordwordwordword wording wordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordtowordwordwordword wording wordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordwordword";
//        String wordOff = "word";
//        String insertWord = "letter";
//
//        char[] sentenceArray = sentence.toCharArray();
//        char[] wordOffArray = wordOff.toCharArray();
//        char[] insertWordArray = insertWord.toCharArray();
//
//        printArrayChar("Basic array : ", sentenceArray);
//
//        double start= System.nanoTime();
//        printArrayChar("\nModified array : ", exchangeWord(sentence, wordOff, insertWord));
//        double finish = System.nanoTime();
//        double period1 = finish-start;
//
//        double start2= System.nanoTime();
//        String arr2 = sentence.replace ("word", "letter");
//        System.out.println(arr2);
//        double finish2 = System.nanoTime();
//        double period2 = finish2-start2;
//
//        System.out.printf(" p1= %f.   p2=%f.",period1,period2);
//    }
//}