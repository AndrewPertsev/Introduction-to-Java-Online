package epam.andrewpertsev.unit2_algorithmization.sorting.task08_denominator;

//8.Даны дроби p1/q1, p2/q2,.., pn/qn( pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

import java.util.ArrayList;
import java.util.List;

public class denominator {
    public static void main(String[] args) {
        List<Fraction> fraction = new ArrayList<>();
        fraction.add(new Fraction(12, 1));
        fraction.add(new Fraction(10, 10));
        fraction.add(new Fraction(7, 100));
        fraction.add(new Fraction(3, 10));

        System.out.println("Initial fraction list" + fraction);

        sortFractionByNumenator(fraction);
    }

    public static double calculateCommonDenominator(List<Fraction> fraction) {
        double commonDenom = 1;
        for (int i = 0; i < fraction.size(); i++) {
            commonDenom = commonDenom * fraction.get(i).getDenominator();
        }
        return commonDenom;
    }

    public static List<Fraction> accordNumenator(List<Fraction> fraction) {
        double accordNum;
        double commonDenom;

        commonDenom = calculateCommonDenominator(fraction);

        for (int i = 0; i < fraction.size(); i++) {
            accordNum = fraction.get(i).getNumenator() * commonDenom / fraction.get(i).getDenominator();
            fraction.get(i).setNumenator(accordNum);
            fraction.get(i).setDenominator(commonDenom);
        }
        System.out.println("Unsorted fraction list : " + fraction);
        return fraction;
    }

    public static List<Fraction> sortFractionByNumenator(List<Fraction> fraction) {
        List<Fraction> commonDenomList;
        commonDenomList = accordNumenator(fraction);

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j = 0; j < commonDenomList.size() - 1; j++) {
                if (commonDenomList.get(j).getNumenator() > commonDenomList.get(j + 1).getNumenator()) {
                    double temp = commonDenomList.get(j).getNumenator();
                    commonDenomList.get(j).setNumenator(commonDenomList.get(j + 1).getNumenator());
                    commonDenomList.get(j + 1).setNumenator(temp);
                    needIteration = true;

                }
            }
        }
        System.out.println("Result sorted fraction list : " + commonDenomList);
        return commonDenomList;
    }
}

class Fraction {
    private double numenator;
    private double denominator;

    public Fraction(double numenator, double denominator) {
        this.denominator = denominator;
        this.numenator = numenator;
        if (denominator == 0) {
            throw new IllegalArgumentException(" Number should be not 0");
        }
    }
    public double getNumenator() { return numenator; }
    public void setNumenator(double numenator) { this.numenator = numenator; }

    public double getDenominator() {
        return denominator;
    }
    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return String.format("Fraction %d/%d.", (long) numenator, (long) denominator);
    }
}
