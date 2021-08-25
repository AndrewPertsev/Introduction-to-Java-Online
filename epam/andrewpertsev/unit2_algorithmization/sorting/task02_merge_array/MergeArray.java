package epam.andrewpertsev.unit2_algorithmization.sorting.task02_merge_array;

//2. Даны две последовательности
//a1<a2<...<an и b1<b2<...<bn Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class MergeArray {
    public static void main(String[] args) {
        int[] mergedArray;
        int[] firstArray = new int[]{1, 5, 8, 8, 10, 77};
        int[] secondArray = new int[]{1, 3, 7, 8, 33, 66, 99};

        mergedArray = mergeArray(firstArray, secondArray);

        printArrayInt("First array : ", firstArray);
        printArrayInt("\nSecond array : ", secondArray);
        printArrayInt("\nMerged array : ", mergedArray);
    }

    public static int[] mergeArray(int[] firstArray, int[] secondArray) {
        int[] mergeArray;

        if (firstArray[firstArray.length - 1] < secondArray[secondArray.length - 1]) {
            int[] temp = firstArray;  //firstArray should has LAST element equal or greater than secondArray
            firstArray = secondArray;
            secondArray = temp;
        }

        mergeArray = new int[firstArray.length + secondArray.length];

        for (int i = 0, j = 0, mergeIndex = 0; mergeIndex < mergeArray.length; i++, mergeIndex++) {
            if (j < secondArray.length) {
                if (secondArray[j] <= firstArray[i]) {
                    mergeArray[mergeIndex] = secondArray[j];
                    j++;
                    i--;
                } else {
                    mergeArray[mergeIndex] = firstArray[i];
                }
            } else {
                mergeArray[mergeIndex] = firstArray[i];
            }
        }
        return mergeArray;
    }


    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}
