package epam.andrewpertsev.unit2_algorithmization.decomposition.task09_quadrum_square;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class QuadrumSquare {
    public static void main(String[] args) {
        double x = 10;
        double y = 12;
        double z = 5;
        double t = 10.63;

        System.out.println(" Quadrum square = " + findQuadrumSquare(x, y, z, t, 10, 12));
                                                 //angles check: is there inner or outer triangle in the quadrum
    }

    public static double findHypot(double sideX, double sideY) {
        double hypotXY;
        hypotXY = Math.hypot(sideX, sideY);
        return hypotXY;
    }

    public static double findRightTriangleSquare(double sideX, double sideY) {
        double rightTriangleSquare = (sideX * sideY) / 2;
        return rightTriangleSquare;
    }

    public static double findFreeTriangleSquare(double sideZ, double sideT, double sideXY) {
        double halfPerim = (sideXY + sideZ + sideT) / 2;
        double freeTriangleSquare = Math.sqrt(halfPerim * (halfPerim - sideXY) * (halfPerim - sideZ) * (halfPerim - sideT));
        return freeTriangleSquare;
    }

    public static double findQuadrumSquare(double sideX, double sideY, double sideZ, double sideT, double angleXY, double angleXT) {
        double squareRight;
        double squareFree;
        double sideXY;

        sideXY = findHypot(sideX, sideY);
        squareRight = findRightTriangleSquare(sideX, sideY);
        squareFree = findFreeTriangleSquare(sideZ, sideT, sideXY);

        if (angleXY < angleXT) {
            return squareRight + squareFree;
        } else {
            return (squareRight - squareFree);
        }
    }
}


