package epam.andrewpertsev.unit2_algorithmization.monoarray.task07_neighbour_element;

//7. Даны действительные числа a1,a2,,an . Найти
//max( a1 + a2n,a2 + a2n+1,,an + an+1) .

public class MaxSumNeighbourElement {
    public static void main(String[] args) {

        int[] massive = new int[]{5, 7, 6, 5, 3, 4, 25, 1, 7, 88};
        int max = 0;
        int sumNeighbour;
        printArrayInt("Array : ", massive);


        for (int i = 0; i < massive.length-1; i++) {
            sumNeighbour = massive[i] + massive[i + 1];

            if (sumNeighbour > max) {
                max = sumNeighbour;
            }
        }
        System.out.println("\nMax sum element a(n)+a(n+1) = " + max);

    }

    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}
