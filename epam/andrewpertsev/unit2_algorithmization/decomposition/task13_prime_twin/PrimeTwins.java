package epam.andrewpertsev.unit2_algorithmization.decomposition.task13_prime_twin;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

import static epam.andrewpertsev.zjio.static_method.StaticMethod.enterIntFromConsole;

import java.util.ArrayList;
import java.util.List;

public class PrimeTwins {
    public static void main(String[] args) {
        int n;
        List<Twins> result;

        n = enterIntFromConsole("Please, enter start number : ");
        PrimeTwins primeTwins = new PrimeTwins(n);

        result = primeTwins.findPrimeTwins(n);

        System.out.println(" Result from range " + n + "..." + findUpperBound(n) + " is : \n" + result);
    }

    public PrimeTwins(int n) {
        if (n < 2) {
            throw new IllegalArgumentException(" Number should be greater than 1");
        }
    }

    public List<Twins> findPrimeTwins(int n) {
        int upperBound;
        upperBound = findUpperBound(n);

        List<Twins> twins = new ArrayList<>();
        for (int i = n; i < upperBound; i++) {
            if (checkIsPrime(i) & checkIsPrime(i + 2)) {
                twins.add(new Twins(i, i + 2));
            }
        }
        return twins;
    }


    public static boolean checkIsPrime(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException(" Number should be positive.");
        }
        boolean isPrime = true;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int findUpperBound(int n) {
        int upperBound;
        upperBound = n * 2;
        return upperBound;
    }
}

class Twins {
    private int firstTwin;
    private int secondTwin;

    Twins(int firstTwin, int secondTwin) {
        this.firstTwin = firstTwin;
        this.secondTwin = secondTwin;
        if (firstTwin <= 0 | secondTwin <= 0) {
            throw new IllegalArgumentException("Numbers should be positive");
        }
    }

    public int getFirstTwin() {
        return firstTwin;
    }

    public void setFirstTwin(int firstTwin) {
        this.firstTwin = firstTwin;
    }

    public int getSecondTwin() {
        return secondTwin;
    }

    public void setSecondTwin(int secondTwin) {
        this.secondTwin = secondTwin;
    }

    public String toString() {
        return String.format("\nPrime Twins : %4d   and %4d ", firstTwin, secondTwin);
    }
}