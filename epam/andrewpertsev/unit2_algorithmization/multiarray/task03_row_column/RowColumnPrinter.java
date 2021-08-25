package epam.andrewpertsev.unit2_algorithmization.multiarray.task03_row_column;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class RowColumnPrinter {
    public static void main(String[] args) {
        int k = 0;
        int p = 4;
        int[][] matrix = {{5, 5, 5, 5, 5},
                          {8, 7, 6, 5, 8},
                          {3, 5, 6, 7, 8},
                          {9, 0, 3, 7, 0},
                          {5, 7, 1, 5, 1}};

        printRow(matrix, k);
        printColumn(matrix, p);

    }

    public static void printRow(int[][] matrix, int rowNumber) {
        System.out.println("\nRow number "+ rowNumber + " :");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[rowNumber][i] + " ");

        }
    }

    public static void printColumn(int[][] matrix, int columnNumber) {
        System.out.print("\nColumn number " + columnNumber + " :");

        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("\n%3d", matrix[i][columnNumber]);

        }
    }
}
