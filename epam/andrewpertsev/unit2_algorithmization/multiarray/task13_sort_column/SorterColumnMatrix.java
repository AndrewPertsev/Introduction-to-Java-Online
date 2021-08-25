package epam.andrewpertsev.unit2_algorithmization.multiarray.task13_sort_column;

//13. Отсортировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class SorterColumnMatrix {
    public static void main(String[] args) {

        int[][] matrixToSort;

        matrixToSort = createRandomMatrix(5, 6);
        printMatrix(matrixToSort, " UnSorted Random Matrix : ");

        sortColumnASC(matrixToSort);
        printMatrix(matrixToSort, "\n ASC Sorted Column Matrix : ");

        sortColumnDESC(matrixToSort);
        printMatrix(matrixToSort, "\n DESC Sorted Column Matrix : ");
    }

    public static int[][] sortColumnASC(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int minIndex = i;
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[k][j] < matrix[minIndex][j])
                        minIndex = k;
                }
                int temp = matrix[minIndex][j];
                matrix[minIndex][j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }

    public static int[][] sortColumnDESC(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int minIndex = i;
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[k][j] > matrix[minIndex][j])
                        minIndex = k;
                }
                int temp = matrix[minIndex][j];
                matrix[minIndex][j] = matrix[i][j];
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

//              i    j
//              j    i
//              k    k
//            ik/ik+1 ij/kj