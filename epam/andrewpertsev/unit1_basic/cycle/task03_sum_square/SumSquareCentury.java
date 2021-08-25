package epam.andrewpertsev.unit1_basic.cycle.task03_sum_square;

//3. Найти сумму квадратов первых ста чисел.

public class SumSquareCentury {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            int number = i * i;
            sum = sum + number;
        }

        System.out.println(" Sum of Squares Century = " + sum); //338350
    }
}
