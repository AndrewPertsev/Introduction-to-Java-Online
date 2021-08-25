package epam.andrewpertsev.unit2_algorithmization.monoarray.task10_array_thinner;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
// элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class ArrayThinner {
    public static void main(String[] args) {

        int[] massive = new int[]{2, 1, -3, 1, 5, 1, 7, 1, 3, 1, 88, 1, 99, 1};
        System.out.println("Initial Array :" + Arrays.toString(massive));

        for (int i = 0; i < massive.length; i++) {
            if (i % 2 != 0) {
                massive[i] = 0;
            }
        }

        for (int i = 0, j = 0; i < massive.length; i += 2, j++) {
            massive[j] = massive[i];
            if (i > massive.length / 2) {
                massive[i] = 0;
            }

        }
        System.out.println(" Array thinned :" + Arrays.toString(massive));
    }
}
