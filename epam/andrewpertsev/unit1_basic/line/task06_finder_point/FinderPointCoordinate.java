package epam.andrewpertsev.unit1_basic.line.task06_finder_point;

//6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

public class FinderPointCoordinate {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        boolean targetPoint;

        if (((y > 0) & (y < 4) & (x > -2) & (x < 2)) | ((y > -3) & (y < 0) & (x > -4) & (x < 4))) {
            targetPoint = true;
        } else {
            targetPoint = false;
        }

        System.out.println("Point belongs to target area : " + targetPoint);
    }
}
