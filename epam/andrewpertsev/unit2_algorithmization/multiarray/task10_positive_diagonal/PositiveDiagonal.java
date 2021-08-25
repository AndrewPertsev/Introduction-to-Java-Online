package epam.andrewpertsev.unit2_algorithmization.multiarray.task10_positive_diagonal;

//10. Найти положительные элементы главной диагонали квадратной матрицы

public class PositiveDiagonal {
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4},
                          {2, 1, 3, 4},
                          {5, 5, 1, 5},
                          {9, 3, 3, -1}};

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.printf("\n Main diagonal positive element is [%d][%d] : %d", i, i, matrix[i][i]);
            }
        }

    }
}
