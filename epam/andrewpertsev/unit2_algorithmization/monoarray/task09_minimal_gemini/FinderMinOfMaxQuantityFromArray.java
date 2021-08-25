package epam.andrewpertsev.unit2_algorithmization.monoarray.task09_minimal_gemini;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class FinderMinOfMaxQuantityFromArray {
    public static void main(String[] args) {

        int[] massive = new int[]{1, 1, 22, 5, 1,-9,-9,-9};
        int maxQuantity = 1;
        int minGemini = 0;
        int quantity;

        printArrayInt("Initial massive : ", massive);

        for (int i = 0; i < massive.length; i++) {
            quantity = 1;
            for (int j = i + 1; j < massive.length; j++) {
                if (massive[i] == massive[j]) {
                    quantity++;
                }
            }
            if (quantity > maxQuantity) {
                maxQuantity = quantity;
                minGemini = massive[i];
            } else if (quantity == maxQuantity) {
                if (massive[i] < minGemini) {
                    minGemini = massive[i];
                }
            }

        }
        System.out.println("\nMin of Most frequent numbers in massive is : " + minGemini);
    }


    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}


