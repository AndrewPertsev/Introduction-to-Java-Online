package epam.andrewpertsev.unit2_algorithmization.decomposition.task02_gcd_four;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class FinderGCDFourNumber {
    public static void main(String[] args) {
        int[] array = {36, 60, 18, 6};
        int gcd;

        gcd = findGcdArrayNumbers(array);

        System.out.println("GCD = " + gcd);

    }


    public static int findGcdArrayNumbers(int[] array) {
        int gcd = array[0];
        for (int i = 1; i < array.length; i++) {
            gcd = findGcdTwoNumbers(gcd, array[i]);
        }
        return gcd;
    }

    public static int findGcdTwoNumbers(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= a; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}
