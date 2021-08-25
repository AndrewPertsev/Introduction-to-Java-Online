package epam.andrewpertsev.unit1_basic.branch.task01_triangle_checker;

//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {

        double aAngle = enterFromConsole("Please, enter the angle \"a\"");
        double bAngle = enterFromConsole("Please, enter the angle \"b\"");
        new TriangleChecker(aAngle, bAngle);
    }

    public TriangleChecker(double aAngle, double bAngle) {
        double commonAngle;
        commonAngle = aAngle + bAngle;
        if (commonAngle < 180 & aAngle > 0 & bAngle > 0) {
            System.out.print("Such a Triangle exists");
            if ((commonAngle == 90) || (aAngle == 90) || (bAngle == 90)) {
                System.out.println(", and it is orthogonal.");
            }
        } else {
            System.out.println("Sorry, no such Triangle exists.");
        }
    }

    public static double enterFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        double value;
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextDouble();
        return value;
    }
}

