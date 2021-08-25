package epam.andrewpertsev.unit2_algorithmization.decomposition.task01_gcd_lcm;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел: НОК(a,b)= a*b/НОД(a,b)

public class FinderGCDandLCM {
    public static void main(String[] args) {
        int a = 8;
        int b= 36;

        System.out.println("GCD = " + findGcdTwoNumbers(a, b));
        System.out.println("LCM = " + findLcmTwoNumbers(a, b));
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

    public static int findLcmTwoNumbers(int a, int b) {
        if (a <= 0 || b <= 0 ) {
            throw new IllegalArgumentException(" Numbers should be positive.");
        }
        int LCM = (a * b) / findGcdTwoNumbers( a, b);
        return LCM;
    }
}