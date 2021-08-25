package epam.andrewpertsev.unit2_algorithmization.multiarray.task05_square_matrix;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): скрин матрицы во вложении

import static epam.andrewpertsev.zjio.static_method.StaticMethod.enterIntFromConsole;

public class SquareMatrixSecond {
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
                if (j > (n - 1 - i)) {
                    squareSecond[i][j] = 0;
                } else {
                    squareSecond[i][j] = i + 1;
                }
                System.out.printf("%3d", squareSecond[i][j]);
            }
            System.out.println();
        }

    }


}

