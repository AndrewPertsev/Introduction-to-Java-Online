package epam.andrewpertsev.unit2_algorithmization.multiarray.task11_random_matrix;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class RandomMatrix {
    public static void main(String[] args) {
        int[][] matrix;
        int rowNumber = 10;
        int columnNumber = 20;
        int targetNumber = 5;

        RandomMatrix randomMatrix = new RandomMatrix();

        matrix = randomMatrix.createMatrix(rowNumber, columnNumber);
        randomMatrix.findRowWithTargetNumber(matrix, targetNumber);

    }

    private int[][] createMatrix(int rowNumber, int columnNumber) {
        int[][] matrix = new int[rowNumber][columnNumber];

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.printf(" %3d ", matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    public void findRowWithTargetNumber(int[][] matrix, int targetNumber) {
        boolean hasMinimum = false;
        System.out.print("\n Rows with count of target Number >3 are: ");

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == targetNumber) {
                    count++;
                }
            }
            if (count >= 3) {
                hasMinimum = true;
                System.out.printf("\nRow number : %d. ", i);
            }
        }
        if (!hasMinimum) {
            System.out.println(" There are not sufficient quantity of target numbers " + targetNumber);
        }

    }
}
