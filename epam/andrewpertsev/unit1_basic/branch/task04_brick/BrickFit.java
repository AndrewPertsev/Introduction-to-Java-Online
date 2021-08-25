package epam.andrewpertsev.unit1_basic.branch.task04_brick;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class BrickFit {
    public static void main(String[] args) {

        double a = 20;
        double b = 50;
        double x = 20;
        double y = 22;
        double z = 80;

        if (x <= a & y <= b ||
                x <= b & y <= a ||
                x <= a & z <= b ||
                x <= b & z <= a ||
                z <= a & y <= b ||
                z <= b & y <= a) {
            System.out.println("Such a Brick fits");
        } else {
            System.out.println("Such a Brick is not fits");
        }
    }
}

