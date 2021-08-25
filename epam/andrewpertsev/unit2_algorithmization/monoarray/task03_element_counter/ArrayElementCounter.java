package epam.andrewpertsev.unit2_algorithmization.monoarray.task03_element_counter;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элемен


public class ArrayElementCounter {

    public static void main(String[] args) {

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        double[] massive = new double[]{2.12, 5, 6, 7, 0, 0, 0, -4, -5};
        printArrayDouble("Massive : ", massive);


        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 0) {
                countPositive++;
            }
            if (massive[i] < 0) {
                countNegative++;
            }
            if (massive[i] == 0) {
                countZero++;
            }

        }
        System.out.println("\nCount of Positive elements : " + countPositive);
        System.out.println("Count of Negative elements : " + countNegative);
        System.out.println("Count of Zero elements : " + countZero);
    }


    public static void printArrayDouble(String message, double[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}
