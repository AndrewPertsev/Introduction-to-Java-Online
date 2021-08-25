package epam.andrewpertsev.unit2_algorithmization.multiarray.task08_column_changer;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class ColumnСhanger {
    public static void main(String[] args) {
        int firstColumnNumber;
        int secondColumnNumber;
        int[][] matrix;
        int[][] changedMatrix;

        firstColumnNumber = enterIntFromConsole("Please, enter the first column number :");
        secondColumnNumber = enterIntFromConsole("Please, enter the second column number :");
        matrix = generateRandomMatrix(enterIntFromConsole(" Please, enter matrix size : "));

        changedMatrix = columnChanger(matrix, firstColumnNumber, secondColumnNumber);

        printMatrix(changedMatrix, " Matrix after replacement columns " + firstColumnNumber + " and " + secondColumnNumber + " :");
    }

    private static int[][] columnChanger(int[][] matrix, int firstColumnNumber, int secondColumnNumber) {

        if ((firstColumnNumber > (matrix.length - 1)) | (secondColumnNumber > (matrix.length - 1)) | firstColumnNumber == secondColumnNumber) {
            throw new IllegalArgumentException(" Column number is greater than matrix size or equal column numbers!");
        }

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][firstColumnNumber];
            matrix[i][firstColumnNumber] = matrix[i][secondColumnNumber];
            matrix[i][secondColumnNumber] = temp;
        }
        return matrix;
    }

    public static int[][] generateRandomMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        System.out.println("Initial random matrix : ");

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d  ", matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    public static int enterIntFromConsole(String message) {
        int value;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.hasNext();
            System.out.println(message);
        }
        value = scanner.nextInt();
        return value;
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
