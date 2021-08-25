package epam.andrewpertsev.unit2_algorithmization.monoarray.task06_sum_primenumbers;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class SumPrimeNumbersArray {
    public static void main(String[] args) {
        double sum = 0;
        boolean isPrime = true;       //           2    3         5         7                    11
        Double[] massive = new Double[]{1.0, 1.1, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 10.0, 0.1};

        for (int i = 2; i < massive.length; i++) {
            for (int divisor = 2; divisor <= massive.length / 2; divisor++) {
                if (i == divisor) {
                    sum = sum + massive[i];
                }

                if (i % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum = sum + massive[i];
            }
            isPrime = true;
        }
        System.out.printf("Sum of Prime Numbers = %3f ", sum);
    }
}


