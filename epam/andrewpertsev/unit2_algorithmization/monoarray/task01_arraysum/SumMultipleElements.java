package epam.andrewpertsev.unit2_algorithmization.monoarray.task01_arraysum;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class SumMultipleElements {
    public static void main(String[] args) {

        int massiveSize = 7;
        int[] massive;
        int k = 3;

        massive = generateRandomIntMassive(massiveSize);
        System.out.println("\nYour divisor k = " + k);
        sumMultiple(massive, k);
    }

    public static void sumMultiple(int massive[], int k) {

        int sum = 0;
        for (int i : massive) {
            if (i % k == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of k-multiple elements = " + sum);
    }

    public static int[] generateRandomIntMassive(int massiveSize) {
        int[] massive = new int[massiveSize];
        System.out.print("Random int massive : ");
        for (int i = 0; i < massiveSize; i++) {
            massive[i] = (int) (Math.random() * massiveSize); // to expand massive boundaries hardcode "massiveSize" here
            System.out.print(massive[i] + " ");
        }
        return massive;
    }

}


