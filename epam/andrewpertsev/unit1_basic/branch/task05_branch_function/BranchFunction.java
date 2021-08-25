package epam.andrewpertsev.unit1_basic.branch.task05_branch_function;

//5. Вычислить значение функции: F(x) = x²-3x+9, если x<=3.  F(x) = 1/(x³ + 6), если x>3

public class BranchFunction {
    public static void main(String[] args) {

        double x = 5;
        double function = 0;

        if (x <= 3) {
            function = x * x - 3 * x + 9;

        } else if (x > 3) {
            function = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.print(" Function Value : " + function);
    }
}
