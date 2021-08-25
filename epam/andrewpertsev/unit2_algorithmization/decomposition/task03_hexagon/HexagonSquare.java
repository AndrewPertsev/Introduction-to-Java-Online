package epam.andrewpertsev.unit2_algorithmization.decomposition.task03_hexagon;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

import static epam.andrewpertsev.zjio.static_method.StaticMethod.enterDoubleFromConsole;

public class HexagonSquare {
    public static void main(String[] args) {
        double side;
        double squareHexagon;

        side = enterDoubleFromConsole("Please, enter the side of hexagon : ");

        squareHexagon = hexagonSquare(triangleSquare(side));

        System.out.printf(" Square of hexagon with side %2f is : %2f", side, squareHexagon);
    }

    public static double triangleSquare(double side) {
        return side * side * Math.sqrt(3) / 4;
    }


    public static double hexagonSquare(double triangleSquare) {
        return triangleSquare * 6;
    }
}
