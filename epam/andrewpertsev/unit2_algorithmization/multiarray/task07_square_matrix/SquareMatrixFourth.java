package epam.andrewpertsev.unit2_algorithmization.multiarray.task07_square_matrix;

//7. Сформировать квадратную матрицу порядка N по правилу: x[i][j] = Math.sin((i * i - j * j) / N)
//и подсчитать количество положительных элементов в ней.

public class SquareMatrixFourth {
    public static void main(String[] args) {

        int sizeN = 7;
        int countPositive = 0;
        double[][] matrix = new double[sizeN][sizeN];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / matrix.length);
                if (matrix[i][j] > 0) {
                    countPositive++;
                }
                System.out.printf("%11f", matrix[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nCount of positive members : " + countPositive);

    }

}
