package epam.andrewpertsev.unit2_algorithmization.monoarray.task05_array_partprinter;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class ArrayPartPrinter {
    public static void main(String[] args) {

        int massiveSize = 7;
        int[] massive;
        massive = generateRandomIntMassive(massiveSize);

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > i) {
                System.out.printf("\n Array element a[%d] > %d : %2d", i, i, massive[i]);
            }
        }
    }

    public static int[] generateRandomIntMassive(int massiveSize) {
        int[] massive = new int[massiveSize];
        System.out.print("Random int massive : ");
        for (int i = 0; i < massiveSize; i++) {
            massive[i] = (int) (Math.random() * massiveSize);
            System.out.print(massive[i] + " ");
        }
        return massive;
    }
}
