package epam.andrewpertsev.unit2_algorithmization.decomposition.task08_triple_sum;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class SumThreeSequenceNumber {
    public static void main(String[] args) {
        int quantityElements = 3;
        int startIndexK1 = 1;
        int startIndexK3 = 3;
        int startIndexK4 = 4;

        int[] massive = new int[]{6, 8, 22, 11, 2, 3, 22, 21};


        System.out.println("Sum of three elements from index \"" + startIndexK1
                + "\" = " + calculateSumOfNElements(massive, startIndexK1,quantityElements));

        System.out.println("Sum of three elements from index \"" + startIndexK3
                + "\" = " + calculateSumOfNElements(massive, startIndexK3,quantityElements));

        System.out.println("Sum of three elements from index \"" + startIndexK4
                + "\" = " + calculateSumOfNElements(massive, startIndexK4,quantityElements));

    }

    public static int calculateSumOfNElements(int[] massive, int startIndexK, int quantity) {
        int sum = 0;
        for (int i = startIndexK; i < startIndexK + quantity; i++) {
            sum += massive[i];
        }
        return sum;
    }
}
