package epam.andrewpertsev.unit2_algorithmization.multiarray.task12_sort_row;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class SorterRowMatrix {
    public static void main(String[] args) {
        int[][] matrixToSort;

        matrixToSort = createRandomMatrix(7, 8);
        printMatrix(matrixToSort, " UnSorted Random Matrix : ");

        sortRowASC(matrixToSort);
        printMatrix(matrixToSort, "\n ASC Sorted Matrix : ");

        sortRowDESC(matrixToSort);
        printMatrix(matrixToSort, "\n DESC Sorted Matrix : ");
    }

    public static int[][] sortRowASC(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                int minIndex = j;
                for (int k = j + 1; k < matrix[j].length; k++) {
                    if (matrix[i][k] < matrix[i][minIndex])
                        minIndex = k;
                }
                int temp = matrix[i][minIndex];
                matrix[i][minIndex] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }

    public static int[][] sortRowDESC(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int minIndex = j;
                for (int k = j + 1; k < matrix[j].length; k++) {
                    if (matrix[i][k] > matrix[i][minIndex])
                        minIndex = k;
                }
                int temp = matrix[i][minIndex];
                matrix[i][minIndex] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }

    public static int[][] createRandomMatrix(int rowNumber, int columnNumber) {
        int[][] matrix = new int[rowNumber][columnNumber];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %2d ", matrix[i][j]);

            }
            System.out.println();

        }
    }
}
