package epam.andrewpertsev.unit2_algorithmization.sorting.task04_swapsort;

//4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= an .Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai  ai+1 , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.


public class SwapSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 8, 33, 66};
        printArrayInt("Initial ASC sorted array : ", array);

        bubbleSort(array);

        printArrayInt("\n DESC sorted array : ", array);
    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {

                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                    needIteration = true;
                    count++;
                }
            }
        }
        System.out.print("\n Quantity of replacements : " + count);
        return array;
    }

    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));
        }
    }
}