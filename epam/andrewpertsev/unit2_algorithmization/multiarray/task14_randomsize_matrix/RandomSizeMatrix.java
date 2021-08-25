package epam.andrewpertsev.unit2_algorithmization.multiarray.task14_randomsize_matrix;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца

import static epam.andrewpertsev.unit2_algorithmization.multiarray.task13_sort_column.SorterColumnMatrix.printMatrix;

public class RandomSizeMatrix {
    public static void main(String[] args) {
        int[][] randomMatrix;
        int maxSizeMatrix = 7;

        randomMatrix = createRandomSizeMatrix(maxSizeMatrix);

        printMatrix(randomMatrix, "Random Size Binary Matrix :");
    }

    public static int[][] createRandomSizeMatrix(int maxSizeMatrix) {
        int m;  //matrix dimensions, to random calculate
        int n;
        int[][] matrix;


        m = ((int) (1 + Math.random() * maxSizeMatrix));
        n = ((int) (1 + Math.random() * maxSizeMatrix));
        if (m < n) {      //swap
            int temp = n;
            n = m;
            m = temp;
        }
        if (m == n) {     //not square matrix
            m = m + 1;
        }


        matrix = new int[m][n];

        for (int i = 0; i < matrix[i].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (count <= i) {
                    matrix[j][i] = 1;
                    count++;
                } else matrix[j][i] = 0;
            }
        }
        return matrix;
    }
}


