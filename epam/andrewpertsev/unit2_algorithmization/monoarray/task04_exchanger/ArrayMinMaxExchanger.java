package epam.andrewpertsev.unit2_algorithmization.monoarray.task04_exchanger;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class ArrayMinMaxExchanger {
    public static void main(String[] args) {

        double[] massive = {-1.2, 3, -888, 5, 4, 555, 6.5, 77};
        changeExtremum(massive, findMinExtremum(massive), findMaxExtremum(massive));
    }

    public static void changeExtremum(double massive[], double min, double max) {
        printArrayDouble("Initial array : ", massive);
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == min) {
                massive[i] = max;
            } else if (massive[i] == max) {
                massive[i] = min;
            }
        }
        printArrayDouble("\nArray after replacement  : ", massive);
    }

    public static double findMaxExtremum(double massive[]) {
        double max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }
        return max;
    }

    public static double findMinExtremum(double massive[]) {
        double min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        return min;
    }


    public static void printArrayDouble(String message, double[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }
}





