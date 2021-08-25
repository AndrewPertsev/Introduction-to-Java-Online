package epam.andrewpertsev.unit2_algorithmization.multiarray.task15_max_odd;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class MaxOddReplacer {
    public static void main(String[] args) {
        int[][] matrix;
        int maxElement;

        matrix = createRandomMatrix(6, 6);
        printMatrix(matrix, "Initial random matrix : ");

        maxElement = findMaxElement(matrix);
        replaceOddElementToMax(matrix, maxElement);

        printMatrix(matrix, "\nMatrix After replacement : ");

    }

    public static int findMaxElement(int[][] matrix) {
        int maxElement = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("\n Max element is : " + maxElement);
        return maxElement;
    }

    public static int[][] replaceOddElementToMax(int[][] matrix, int maxElement) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxElement;
                }
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
