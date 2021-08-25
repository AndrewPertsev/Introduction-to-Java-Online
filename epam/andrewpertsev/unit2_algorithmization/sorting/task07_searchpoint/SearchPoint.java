package epam.andrewpertsev.unit2_algorithmization.sorting.task07_searchpoint;

//7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. .
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.ArrayList;
import java.util.List;

public class SearchPoint {
    public static void main(String[] args) {
        List<Integer> indexes;
        int[] firstArray = new int[]{1, 3, 5, 7, 8};
        int[] toInsertInFirstArray = new int[]{0, 5, 6, 9};

        indexes = findIndexesArray(firstArray, toInsertInFirstArray);

        System.out.println(indexes);
    }

    public static List<Integer> findIndexesArray(int[] firstArray, int[] secondArray) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            if (j < secondArray.length) {
                if (secondArray[j] <= firstArray[i]) {
                    indexes.add(i);
                    j++;
                    i--;
                } else if (firstArray[firstArray.length - 1] < secondArray[j]) {
                    indexes.add(firstArray.length);
                    j++;

                }
            }
        }
        return indexes;
    }
}