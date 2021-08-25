package epam.andrewpertsev.unit1_basic.branch.task03_point_line;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class PointOnLineChecker {
    public static void main(String[] args) {

         double x1 = 20;
         double y1 = 40;
         double x2 = 10;
         double y2 = 20;
         double x3 = -30;
         double y3 = -60;
         double lengthAB;
         double lengthBC;
         double lengthAC;

         lengthAB = findLength(x1, y1, x2, y2);
         lengthBC = findLength(x2, y2, x3, y3);
         lengthAC = findLength(x1, y1, x3, y3);
         checkOnLine(lengthAB, lengthBC, lengthAC);
    }

    public static void checkOnLine(double lengthAB, double lengthBC, double lengthAC) {
        if ((lengthAC == lengthAB + lengthBC) | (lengthBC == lengthAB + lengthAC)) {
            System.out.println("Points are ON line.");
        } else {
            System.out.println("Points are OUT line.");
        }
    }

    public static double findLength(double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
        double length;
        length = Math.hypot((firstPointX - secondPointX), (firstPointY - secondPointY));
        return length;

    }
}



