package epam.andrewpertsev.unit2_algorithmization.decomposition.task06_prime;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class IsMutuallySimpleNumber {
    public static void main(String[] args) {

        int[] array = {50, 25, 10};

        System.out.println(" These numbers are mutually simple ? : " + isMutuallySimple(array));
    }

    public static boolean isMutuallySimple(int[] array) {
        int gcd;
        gcd = findGcdArrayNumbers(array);
        if (gcd == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static int findGcdTwoNumbers(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException(" Numbers should be positive.");
        }
        int gcd = 0;

        for (int i = 1; i <= a; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int findGcdArrayNumbers(int[] array) {
        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = findGcdTwoNumbers(gcd, array[i]);
        }
        return gcd;
    }
}
