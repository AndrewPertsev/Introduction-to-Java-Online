package epam.andrewpertsev.unit1_basic.cycle.task04_multiply_square;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class MultiplySquareTwoCenturies {
    public static void main(String[] args) {

        int quantityNumbers = 200;

        multiplySquareBigInteger(quantityNumbers);
        multiplySquareInt(quantityNumbers);

    }

    public static void multiplySquareInt(int quantityNumbers) {

        long productIntResult = 1;

        for (int i = 2; i <= quantityNumbers; i++) {
            long square = i * i;
            long temp = productIntResult * square;

            if (productIntResult > temp) {
                System.out.println("Type \"Long\" Overflow!");
                break;

            } else {
                productIntResult = temp;
                System.out.println("Value of product Result \"Long\" up to " + i + " : " + productIntResult);
            }

        }
        System.out.println("Long max value : " + Long.MAX_VALUE);
    }

    public static void multiplySquareBigInteger(int quantityNumbers) {

        BigInteger productBigIntegerResult = BigInteger.valueOf(1);

        for (int j = 2; j <= quantityNumbers; j++) {
            productBigIntegerResult = productBigIntegerResult.multiply(BigInteger.valueOf(j * j));
        }
        System.out.println("BigInteger product Result is : " + productBigIntegerResult);
    }
}
