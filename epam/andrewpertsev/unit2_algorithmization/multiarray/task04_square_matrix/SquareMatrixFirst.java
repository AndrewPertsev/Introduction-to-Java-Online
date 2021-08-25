package epam.andrewpertsev.unit2_algorithmization.multiarray.task04_square_matrix;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): скрин матрицы во вложении

import static epam.andrewpertsev.zjio.static_method.StaticMethod.enterIntFromConsole;

public class SquareMatrixFirst {
    public static void main(String[] args) {
        int n;
        n = enterIntFromConsole("Please, enter matrix size : ");

        if (n % 2 != 0) {
            throw new IllegalArgumentException("Number n should be even.");
        }

        int[][] squareArray = new int[n][n];

        System.out.println(" The square matrix size " + n + " :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    squareArray[i][j] = j + 1;
                } else {
                    squareArray[i][j] = n - j;
                }
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();

        }
    }
}
