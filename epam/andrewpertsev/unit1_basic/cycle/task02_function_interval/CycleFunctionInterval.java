package epam.andrewpertsev.unit1_basic.cycle.task02_function_interval;

//Вычислить значения функции на отрезке [а,b] c шагом h:  y=x, x>2 ; y=-x, x<=2.

public class CycleFunctionInterval {
    public static void main(String[] args) {

        double a = 1;
        double b = 3.5;
        double h = 0.5;
        double y;

        for (double x = a; x <= b; x += h) {
            if (x <= 2) {
                y = -x;
            } else {
                y = x;
            }
                System.out.println("If x = " + x + ", Function y = " + y);
        }
    }
}