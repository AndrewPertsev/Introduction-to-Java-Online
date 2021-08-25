package epam.andrewpertsev.unit2_algorithmization.decomposition.task05_submax;

//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

public class FinderSubMaxNumber {
    public static void main(String[] args) {
        int subMax;

        int[] massive = new int[]{ 6, 8, 22, 11, 2, 3, 22, 21};

        subMax = findSubMaxElement(massive);

        System.out.println("SubMaximum number = " + subMax );

    }

    public static int findMaxExtremum(int massive[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }

        return max;
    }

    public static int findSubMaxElement(int massive[]) {
        int max = findMaxExtremum(massive);
        int subMax = Integer.MIN_VALUE;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > subMax & massive[i] != max) {
                subMax = massive[i];
            }
        }

        return subMax;
    }
}
