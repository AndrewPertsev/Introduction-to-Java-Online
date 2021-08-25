package epam.andrewpertsev.unit1_basic.cycle.task05_sum_serie;

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид: aₙ = 1/2ₙ + 1/3ₙ

public class SumModuleNumberSerie {
    public static void main(String[] args) {

        double sum = 0;
        double e = 0.01;

        for (int n = 1; n > 0; n++) {
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (Math.abs(a) <= e) {
                break;
            }
            sum += a;
        }
        System.out.print("Sum of modules : " + sum);
    }
}
