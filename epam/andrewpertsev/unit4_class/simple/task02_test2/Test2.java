package epam.andrewpertsev.unit4_class.simple.task02_test2;

//2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Test2 {
    private int id;
    private String name;

    public Test2() {
    }

    public Test2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("id = %d, name = %s", id, name);
    }

    public void print(String message, int param) {
        System.out.println(message + param);
    }

    public static void main(String[] args) {
        Test2 test3 = new Test2(100, "Andrew");
        Test2 test4 = new Test2();

        System.out.println(test3);
        System.out.println(test4);

    }
}

