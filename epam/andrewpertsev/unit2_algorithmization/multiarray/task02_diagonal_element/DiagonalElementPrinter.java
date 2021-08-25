package epam.andrewpertsev.unit2_algorithmization.multiarray.task02_diagonal_element;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class DiagonalElementPrinter {
    public static void main(String[] args) {
        int[][] matrix = {{5, 5, 5, 5, 5},
                          {8, 7, 6, 5, 8},
                          {3, 5, 6, 7, 8},
                          {9, 0, 3, 7, 0},
                          {5, 7, 1, 5, 1}};
        printMainDiagonal(matrix);
        printMinorDiagonal(matrix);

    }

    public static void printMainDiagonal(int[][] matrix) {
        System.out.println(" Main diagonal elements : ");

        for (int i = 0; i < matrix.length; i++) {
                    System.out.print(matrix[i][i] + " ");
        }
    }

    public static void printMinorDiagonal(int[][] matrix) {
        System.out.println("\n Minor diagonal elements : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) == (matrix.length - 1)) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}