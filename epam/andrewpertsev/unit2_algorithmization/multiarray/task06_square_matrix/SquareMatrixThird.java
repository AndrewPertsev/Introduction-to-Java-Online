package epam.andrewpertsev.unit2_algorithmization.multiarray.task06_square_matrix;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): скрин матрицы во вложении

import static epam.andrewpertsev.unit1_basic.line.task05_time_format.TimeLengthFormat.enterIntFromConsole;

public class SquareMatrixThird {
    public static void main(String[] args) {
        int n;
        n = enterIntFromConsole("Please, enter matrix size : ");

        if (n % 2 != 0) {
            throw new IllegalArgumentException("Number n should be even.");
        }

        System.out.println(" The square matrix size " + n + " :");
        int[][] squareSecond = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((j <= i) & (j + i) >= n - 1) || (j >= i & ((j + i) < n))) {
                    squareSecond[i][j] = 1;
                } else {
                    squareSecond[i][j] = 0;
                }
                System.out.printf("%3d", squareSecond[i][j]);
            }
            System.out.println();
        }

    }
}
