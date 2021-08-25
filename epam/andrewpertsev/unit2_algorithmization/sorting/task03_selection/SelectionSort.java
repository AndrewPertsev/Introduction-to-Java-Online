package epam.andrewpertsev.unit2_algorithmization.sorting.task03_selection;

//3. Сортировка выбором. Дана последовательность чисел возрастающая .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 8, 33, 66, 99};
        printArrayInt("Initial ASC sorted array : ", array);

        selectionSort(array);

        printArrayInt("\n DESC sorted array : ", array);

    }
    public static int[] selectionSort (int[] array){
        for (int i = 0; i <array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex]<array[j])
                    minIndex = j;
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

    return array;}


    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}
