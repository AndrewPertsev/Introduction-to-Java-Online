package epam.andrewpertsev.unit2_algorithmization.multiarray.task01_odd_column;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.


public class MatrixOddColumn {
    public static void main(String[] args) {

        int[][] matrix = {{5, 5, 5, 5, 5},
                          {8, 7, 6, 5, 8},
                          {3, 5, 6, 7, 8},
                          {9, 0, 3, 7, 0},
                          {5, 7, 1, 5, 1}};

        System.out.println(" Columns, with the first element greater then the last element : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j % 2 == 0) {
                    if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                        System.out.printf("%3d", matrix[i][j]);
                    }
                }
            }
           System.out.println();

        }
    }
}
