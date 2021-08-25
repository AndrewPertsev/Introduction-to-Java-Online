package epam.andrewpertsev.unit2_algorithmization.sorting.task06_shellsort;

//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
//на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 8, 499, 1, -9, 18, 11, 13, 1};
        printArray("Initial array : ", array);

        gnomeSort(array);

        printArray("\nGnome Sorted array : ", array);

        shellSort(array);

        printArray("\nShell Sorted array : ", array);
    }

    public static int[] gnomeSort(int[] array) {
        int i = 0;

        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
        return array;
    }

    public static int[] shellSort(int[] array) {
        int interval = 1;
        int n = array.length;
        while (interval < n / 3)
            interval = 3 * interval + 1;

        while (interval >= 1) {
            for (int i = interval; i < array.length; i++) {
                for (int j = i; j >= interval && array[j] < array[j - interval]; j -= interval) {
                    int temp = array[j];
                    array[j] = array[j - interval];
                    array[j - interval] = temp;
                }
            }
            interval = interval / 3;
        }
        return array;
    }

    public static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
}
