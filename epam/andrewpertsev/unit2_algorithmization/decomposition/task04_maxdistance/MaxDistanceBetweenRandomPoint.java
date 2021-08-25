package epam.andrewpertsev.unit2_algorithmization.decomposition.task04_maxdistance;

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив

import java.util.ArrayList;
import java.util.List;

import static epam.andrewpertsev.zjio.static_method.StaticMethod.enterIntFromConsole;

public class MaxDistanceBetweenRandomPoint {
    public static void main(String[] args) {
        int n;

        n = enterIntFromConsole("Please, enter quantity of points : ");
        MaxDistanceBetweenRandomPoint distanceFinder = new MaxDistanceBetweenRandomPoint();

        double[] results = distanceFinder.findMaxDistance(n);
        distanceFinder.printResults(results);
    }

    public static List<Point> fillMassiveRandomPoint(int size) {
        List<Point> point = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            point.add(i, new Point(Math.random() * 20 - 10, Math.random() * 20 - 10));
        }
        return point;
    }

    public double[] findMaxDistance(int quantityPoints) {
        double length;
        double maxDistance = 0;
        List<Point> point = fillMassiveRandomPoint(quantityPoints);
        Point pointMax1 = null;
        Point pointMax2 = null;
        double[] results = new double[3];

        for (int i = 0; i < point.size() - 1; i++) {
            for (int j = 0; j < point.size(); j++) {
                length = findDistance(point.get(i).getX(),
                                      point.get(i).getY(),
                                      point.get(j).getX(),
                                      point.get(j).getY());
                if (length > maxDistance) {
                    maxDistance = length;
                    results[0] = maxDistance;
                    results[1] = i;
                    results[2] = j;
                    pointMax1 = point.get(i);
                    pointMax2 = point.get(j);

                }
            }
        }
        System.out.print("First " + pointMax1 + " and second " + pointMax2);
        return results;
    }

    public static double findDistance(double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
        double length;
        length = Math.hypot((firstPointX - secondPointX), (firstPointY - secondPointY));
        return length;
    }

    public void printResults(double[] results) {
        System.out.printf("\nMax distance %.2f is between point number \"%.1f\" and point number \"%.1f\".", results[0], results[1], results[2]);
    }
}

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("point coordinates are (x=%.2f, y=%.2f)", x, y);
    }
}
