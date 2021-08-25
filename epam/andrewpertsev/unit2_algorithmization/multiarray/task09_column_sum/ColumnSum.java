package epam.andrewpertsev.unit2_algorithmization.multiarray.task09_column_sum;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//   столбец содержит максимальную сумму.

public class ColumnSum {
    public static void main(String[] args) {
        int sumColumn;
        int indexMaxSumColumn = 0;
        int maxSumColumn = 0;
        int[][] matrix = new int[][]{{1, 14, 6, 9},
                                     {2, 2, 2, 2},
                                     {2, 2, 2, 2}
        };

        for (int i = 0; i < matrix[0].length; i++) {
            sumColumn = 0;
            for (int j = 0; j < matrix.length; j++) {
                sumColumn = sumColumn + matrix[j][i];

            }
            System.out.println(" Sum of elements column " + i + " = " + sumColumn);
            if (sumColumn > maxSumColumn) {
                maxSumColumn = sumColumn;
                indexMaxSumColumn = i;

            }
        }
        System.out.printf(" Max sum of elements has the %d column   : %d ", indexMaxSumColumn, maxSumColumn);

    }
}
