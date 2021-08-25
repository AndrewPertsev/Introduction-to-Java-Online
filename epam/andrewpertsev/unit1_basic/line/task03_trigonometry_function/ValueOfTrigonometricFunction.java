package epam.andrewpertsev.unit1_basic.line.task03_trigonometry_function;

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(𝑠𝑖𝑛(𝑥) + 𝑐𝑜𝑠(𝑦)) / (𝑐𝑜𝑠(𝑥) − 𝑠𝑖𝑛(𝑦)) *  𝑡𝑔 𝑥𝑦

import static java.lang.Math.*;

public class ValueOfTrigonometricFunction {
    public static void main(String[] args) {

        double x = 1.047191;
        double y = 0.523597;
        double valueOfExpression;

        boolean checkerZero = (cos(x) == sin(y));
        if (checkerZero) {
            throw new IllegalArgumentException("Division by 0, change values X or Y");
        }

        valueOfExpression = ((sin(x) + cos(y)) / (cos(x)-sin(y)) * tan(x * y));

        System.out.println("\nValue of the Trigonometric Expression = " + valueOfExpression);

        System.out.println("\nChecking value cos(x) and sin(y) : " + cos(x) + "    " + sin(y));


    }
}

