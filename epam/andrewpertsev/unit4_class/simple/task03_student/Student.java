package epam.andrewpertsev.unit4_class.simple.task03_student;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int group;
    private int[] performance = new int[5];

    public Student() {
    }
    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public Student(String surname, String name, int group, int[] performance) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.performance = performance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {

        this.performance = performance;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", performance=" + Arrays.toString(performance) +
                '}';
    }
    public boolean isTopStudent() {
        int count = 0;
        boolean isTop = false;
        for (int i = 0; i < performance.length; i++) {
            if (performance[i] >= 9) {
                count++;
            }
        }
        if (count == 5) {
            isTop = true;
        }
        return isTop;
    }

}