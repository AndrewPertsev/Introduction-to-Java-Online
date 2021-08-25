package epam.andrewpertsev.zjio.static_method;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class StaticMethod {

    public static int enterIntFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextInt();
        return value;

    }
    public static double enterDoubleFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        double value;
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextDouble();
        return value;

    }
    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }

    public static void printMatrix(String message, int[][] matrix) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %2d ", matrix[i][j]);

            }
            System.out.println();

        }
    }
    public static int[] generateRandomIntMassive(int massiveSize) {
        int[] massive = new int[massiveSize];
        System.out.print("Random int massive : ");
        for (int i = 0; i < massiveSize; i++) {
            massive[i] = (int) (Math.random() * massiveSize); // to expand massive boundaries hardcode "massiveSize" here
            System.out.print(massive[i] + " ");
        }
        return massive;
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
    private int[][] createMatrix(int rowNumber, int columnNumber) {
        int[][] matrix = new int[rowNumber][columnNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                matrix[i][j] = (int) (Math.random() * 15);// to expand massive boundaries hardcode "massiveSize"
                System.out.printf(" %3d ", matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }


    public static int findMinExtremum(int massive[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        return min;
    }

    public static int findQuantityMinExtremum(int massive[], int minElement) {
        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == minElement) {
                count++;
            }
        }
        return count;
    }

    public static void printRow(int[][] matrix, int rowNumber) {
        System.out.println("\nRow number " + rowNumber + " :");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[rowNumber][i] + " ");

        }
    }

    public static void printColumn(int[][] matrix, int columnNumber) {
        System.out.print("\nColumn number " + columnNumber + " :");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("\n%3d", matrix[i][columnNumber]);

        }
    }

    public static double findLength(double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
        double length;
        length = Math.hypot((firstPointX - secondPointX), (firstPointY - secondPointY));
        return length;

    }

    public static void divisorsFromInterval(int mPoint, int nPoint) {
        boolean isDivisor = false;

        for (int i = mPoint; i <= nPoint; i++) {
            System.out.print(" Number " + i + " has divisors: ");
            for (int divisor = 2; divisor <= nPoint / 2; divisor++) {
                if (i == divisor) {
                    continue;
                }
                if (i % divisor == 0) {
                    isDivisor = true;
                    System.out.print(" " + divisor + " ");
                }
            }
            if (isDivisor == false) {
                System.out.print(" divisors are absent.");
            }
            System.out.println();
            isDivisor = false;
        }
    }
    public int findSumOfDigits(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        return sum;
    }
    public static boolean checkIsNumbersFullOddDigitContent(int number) {
        boolean isFullOddDigits = false;
        int digit;
        while (number > 0) {
            isFullOddDigits = false;
            digit = number % 10;
            if (digit % 2 != 0) {
                isFullOddDigits = true;
            } else {
                break;
            }
            number = number / 10;
        }return  isFullOddDigits;


    }
    public static int generateNumberFullOddDigits(int capacity) {
        int oddsNumber;
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < capacity) {
            oddsNumber = (int) (Math.random() * 10);

            if ((oddsNumber % 2) != 0) {
                builder.append(oddsNumber);
                i++;
            }
        }
        oddsNumber = valueOf(builder.toString());
        return oddsNumber;
    }
    public static void printArrayInt(String message, List<Integer> array) {
        System.out.print(message);
        array.forEach(System.out::println);
    }

}
//for(String element : array){
//    System.out.println(element);
//}
class StringLengthComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else return o1.compareTo(o2);
    }

    @Override
    public Comparator<String> reversed() {
        return null;
    }
}
