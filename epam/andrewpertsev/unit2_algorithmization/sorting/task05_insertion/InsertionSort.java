package epam.andrewpertsev.unit2_algorithmization.sorting.task05_insertion;

//5. Сортировка вставками. Дана последовательность чисел a1,a2,,an . Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1,a2,,ai - упорядоченная последовательность, т. е.
//a1 <= a2 <= ... <= an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {6, 1, -1, 1, 99, 11};

        printArray("Initial array : ", array);

        insertionSortBinSearch(array);

        printArray("\nSorted array : ", array);

    }

    public static int[] insertionSortBinSearch(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int index = binarySearchIndex(array, i, array[i]);

            for (int j = i - 1; j >= index; j--) {
                array[j + 1] = array[j];
            }
            array[index] = temp;
        }
        return array;
    }

    public static int binarySearchIndex(int[] massive, int lengthMassive, int number) {
        int first = 0;
        int last = lengthMassive - 1;
        int mid = (first + last) / 2;
        if (number < massive[0]) {
            return first;
        }
        if (number > massive[last]) {
            return last + 1;
        }
        while (first <= last) {
            if (massive[mid] == number) {
                break;
            }
            if (massive[mid] < number) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            return mid + 1;
        }
        return mid;
    }

    public static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int element : array) {
            System.out.print(element + ", ");
        }

    }

    public static int[] insertSortSetBinSearch(int[] array) { //suitable for sets
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;

            while (j >= 0 && array[i] <= array[binarySearchIndex(array, i, array[i])]) {
               // System.out.println("\n" + array[i] + " at index " + i + " move to index:" + binarySearchIndex(array, i, array[i]) + " (replace " + array[binarySearchIndex(array, i, array[i])] + ")");

                if (array[i] == array[binarySearchIndex(array, i, array[i])]) {
                    j = -1;
                }
                int buffer = array[i];
                array[i] = array[binarySearchIndex(array, i, array[i])];
                array[binarySearchIndex(array, i, array[i])] = buffer;
                j--;


                System.out.println(array[i] + " at " + i);
            }
        }
        printArray("\nSorted array : ", array);
        return array;
    }
}

