package epam.andrewpertsev.unit2_algorithmization.decomposition.task17_subtraction;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Subsrtactor {
    public static void main(String[] args) {
        int number = 1000;

        System.out.println("\nFor number \"" + number + "\" quantity of substractions = " + substractToZero(number));
    }

    public static int substractToZero(int number) {
        int countSubstraction = 0;

        while (number > 0) {
            number = number - findSumOfDigits(number);
            countSubstraction++;
        }

        return countSubstraction;
    }

    public static int findSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
