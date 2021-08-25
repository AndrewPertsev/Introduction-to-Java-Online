package epam.andrewpertsev.unit2_algorithmization.sorting.task01_insertarray;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.


public class InsertArray {
    public static void main(String[] args) {
        int[] arrayInserted;
        int[] firstArray = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        int[] secondArray = new int[]{8, 8, 8, 8};
        int k = 2;

        arrayInserted = insertArray(firstArray, secondArray, k);

        printArrayInt("First array : ", firstArray);
        printArrayInt("\nSecond array : ", secondArray);
        System.out.println("\nPosition start = " + k);
        printArrayInt("\nInserted array : ", arrayInserted);

    }

    public static int[] insertArray(int[] firstArray, int[] secondArray, int startPosition) {

        int[] insertArray = new int[firstArray.length + secondArray.length];

        for (int i = 0, j = 0; i < insertArray.length; i++) {
            if (i <= startPosition) {
                insertArray[i] = firstArray[i];
            } else if (i < (startPosition + secondArray.length + 1)) {
                insertArray[i] = secondArray[j];
                j++;
            } else {
                insertArray[i] = firstArray[i - secondArray.length];
            }

        }
        return insertArray;
    }

    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}

