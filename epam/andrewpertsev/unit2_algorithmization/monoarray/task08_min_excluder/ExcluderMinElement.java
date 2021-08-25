package epam.andrewpertsev.unit2_algorithmization.monoarray.task08_min_excluder;

//8. Дана последовательность целых чисел a1,a2,,an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1,a2,,an) .

public class ExcluderMinElement {
    public static void main(String[] args) {
        int[] massive = new int[]{1, 7, 6, 1, 3, 4, 5, 1, 8, 7, 11, 77};
        int minElement;
        int quantityMin;
        int[] massiveExcludeMin;

        minElement = findMinExtremum(massive);
        quantityMin = findQuantityMinExtremum(massive, minElement);
        massiveExcludeMin = excludeMinExtremum(massive, minElement, quantityMin);

        printArrayInt("Initial massive : ", massive);
        System.out.println("\nQuantity of Min Element (" + minElement + ") : " + quantityMin + ".");
        printArrayInt("New massive exclude MIN elements : ", massiveExcludeMin);

    }

    public static int findMinExtremum(int massive[]) {
        int min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        return min;
    }

    public static int findQuantityMinExtremum(int massive[], int minElement) {
        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == minElement) {
                count++;
            }
        }
        return count;
    }

    public static int[] excludeMinExtremum(int massive[], int minElement, int quantityMin) {
        int[] massiveExcludeMin = new int[massive.length - quantityMin];
        for (int i = 0, j = 0; i < massive.length; i++) {

            if (massive[i] != minElement) {
                massiveExcludeMin[j] = massive[i];
                j++;
            }
        }
        return massiveExcludeMin;
    }


    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}


