package epam.andrewpertsev.unit2_algorithmization.decomposition.task11_longest_number;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class FindLongestNumber {
    public static void main(String[] args) {
        int firstNumber = 1234567;
        int secondNumber = 9876;

        printResult(longestNumber(firstNumber, secondNumber));

    }

    public static int findLengthDigitMassive(int number) {
        int lengthMassive = 0;
        while (number > 0) {
            lengthMassive++;
            number = number / 10;
        }
        return lengthMassive;
    }

    public static int longestNumber(int firstNumber, int secondNumber) {
        int number1length;
        int number2length;
        number1length = findLengthDigitMassive(firstNumber);
        number2length = findLengthDigitMassive(secondNumber);

        if (number1length > number2length) {
            return firstNumber;
        } else if (number1length < number2length) {
            return secondNumber;
        } else {
            return 0;
        }
    }

    public static void printResult(int number) {
        if (number != 0) {
            System.out.println(number + " has greater quantity of digits : " + findLengthDigitMassive(number));
        } else {
            System.out.println("Numbers have similar length");
        }
    }
}
