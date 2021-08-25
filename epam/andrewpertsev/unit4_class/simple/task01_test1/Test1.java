package epam.andrewpertsev.unit4_class.simple.task01_test1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Test1 {
    private int length;
    private int width;

    public Test1() {
    }

    public Test1(int length, int width) {
        this.width = width;
        this.length = length;
    }

    public int findSum() {
        return length + width;

    }

    public int findMax() {
        return Math.max(length, width);

    }

    public void print() {
        System.out.printf("length = %d, width = %d\n",length, width );
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return String.format("length = %d, width = %d", width, length);
    }


    public static void main(String[] args) {
        int length = 100;
        int width = 200;

        int sum;
        int max;

        Test1 test1 = new Test1();

        test1.setLength(length);
        test1.setWidth(width);

        sum = test1.findSum();
        max = test1.findMax();

        test1.print();

        System.out.println("Max : " + max);
        System.out.println("Sum : " + sum);

    }
}
