package epam.andrewpertsev.unit1_basic.branch.task02_minmax;

//2. Найти max{min(a, b), min(c, d)}.

public class MaxOfMin {
    public static void main(String[] args) {

        findMaxOfMin(11, 22, 44,55);
    }

    public static void findMaxOfMin(int a, int b, int c, int d) {
         int abMinimal;
         int cdMinimal;
         int maximum;

        if (a < b) {
            abMinimal = a;
        } else {
            abMinimal = b;
        }
        if (c < d) {
            cdMinimal = c;
        } else {
            cdMinimal = d;
        }
        if (abMinimal > cdMinimal) {
            maximum = abMinimal;
        } else {
            maximum = cdMinimal;
        }
        System.out.println(" Maximum from minimals max{min(a, b), min(c, d)}: " + maximum);
    }

}
