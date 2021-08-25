package epam.andrewpertsev.unit2_algorithmization.multiarray.task16_magicsquare;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//...,2n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//        6 1 8
//        7 5 3
//        2 9 4

public class MagicSquare {
    public static void main(String[] args) {
        int[][] magicSquare;
        int matrixSize = 8;

        if (matrixSize % 2 != 0) {
            magicSquare = oddMatrix(matrixSize);
        } else if (matrixSize % 4 == 0) {
            magicSquare = multipleFourMatrix(matrixSize);
        } else {
            magicSquare = evenOddMatrix(matrixSize);
        }

        printMatrix(magicSquare);
        checkMagicSquare(magicSquare);
    }

    private static int[][] oddMatrix(int n) {
        int[][] oddMatrix = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        oddMatrix[i--][j++] = 1;
        for (int k = 2; k <= Math.pow(n, 2); i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (oddMatrix[i][j] != 0) {
                i += 2;
                j--;
            }
            oddMatrix[i][j] = k;
        }
        return oddMatrix;
    }

    private static int[][] multipleFourMatrix(int n) {
        int[][] multipleFourMatrix = new int[n][n];
        int baseElement = 1;

        for (int i = 0; i < multipleFourMatrix.length; i++) {
            for (int j = 0; j < multipleFourMatrix.length; j++) {
                multipleFourMatrix[i][j] = baseElement;
                baseElement++;
            }
        }

        for (int i = 0; i < n; i += 4) {
            for (int j = 1; j < n; j += 4) {
                multipleFourMatrix[i][j] = n * n + 1 - multipleFourMatrix[i][j];
                multipleFourMatrix[i + 3][j] = n * n + 1 - multipleFourMatrix[i + 3][j];
                multipleFourMatrix[i][j + 1] = n * n + 1 - multipleFourMatrix[i][j + 1];
                multipleFourMatrix[i + 3][j + 1] = n * n + 1 - multipleFourMatrix[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4) {
            for (int j = 0; j < n; j += 4) {
                multipleFourMatrix[i][j] = n * n + 1 - multipleFourMatrix[i][j];
                multipleFourMatrix[i + 1][j] = n * n + 1 - multipleFourMatrix[i + 1][j];
                multipleFourMatrix[i][j + 3] = n * n + 1 - multipleFourMatrix[i][j + 3];
                multipleFourMatrix[i + 1][j + 3] = n * n + 1 - multipleFourMatrix[i + 1][j + 3];
            }
        }
        return multipleFourMatrix;
    }

    private static int[][] evenOddMatrix(int n) {
        int[][] matrix = new int[n][n];
        int[][] matrixCut = multipleFourMatrix(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                matrix[i][j] = matrixCut[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int l = n / 2;
        int d = n * n + 1;

        matrix[0][0] = 3 * l - 1;
        matrix[0][n - 1] = 1;
        matrix[n - 1][0] = d - 1;
        matrix[n - 1][n - 1] = d - 3 * l + 1;

        int i, j;
        for (i = 1; i <= l - 2; i++) {
            matrix[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= l; j++) {
            matrix[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            matrix[n - 1][j] = n * n + 1 - matrix[0][j];
        }
        matrix[1][0] = 2 * l - 1;
        for (i = 1; i <= l / 2; i++) {
            matrix[i + 1][0] = 3 * l - 1 - i;
        }
        i--;
        for (j = 1; j <= l / 2 + 1; j++) {
            matrix[i + j + 1][0] = d - 4 * l + 1 + j;
        }
        j--;
        for (int q = 1; q <= l / 2 - 1; q++, i++) {
            matrix[i + j + q + 1][0] = 3 * l - 1 + q;
            matrix[i + j + q + 2][0] = d - 2 * l - q;
        }

        for (i = 1; i < n - 1; i++) {
            matrix[i][n - 1] = n * n + 1 - matrix[i][0];
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }

    public static void checkMagicSquare(int[][] magicSquare) {

        double mainDiagonalSum = 0;
        double sideDiagonalSum = 0;
        boolean isMagicSquare;

        for (int i = 0; i < magicSquare.length; i++) {
            mainDiagonalSum = magicSquare[i][i] + mainDiagonalSum;
        }

        for (int i = 0; i < magicSquare.length; i++) {  //cycle check sums rows,columns and side diagonal
            double rowSum = 0;
            double columnSum = 0;

            for (int j = 0; j < magicSquare.length; j++) {
                rowSum = magicSquare[i][j] + rowSum;
                columnSum = magicSquare[j][i] + columnSum;
                if ((i + j) == (magicSquare.length - 1)) {
                    sideDiagonalSum = sideDiagonalSum + magicSquare[i][j];
                }

            }
            if (mainDiagonalSum != rowSum || mainDiagonalSum != columnSum) {
                break;
            }
        }

        isMagicSquare = (mainDiagonalSum == sideDiagonalSum);
        System.out.println("\nIt is the Magic Square : " + isMagicSquare);
        System.out.print("\nMain Diagonal Sum = " + mainDiagonalSum + "\nSide Diagonal Sum = " + sideDiagonalSum);


    }
}

