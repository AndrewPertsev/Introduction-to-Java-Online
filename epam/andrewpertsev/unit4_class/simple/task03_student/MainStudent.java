package epam.andrewpertsev.unit4_class.simple.task03_student;

public class MainStudent{
    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = (new Student("Petrov", "Petr", 101, new int[]{7, 6, 9, 8, 8}));
        students[1] = (new Student("Ivanov", "Petr", 101, new int[]{10, 10, 9, 10, 10}));
        students[2] = (new Student("Sidorov", "Petr", 102, new int[]{7, 8, 9, 8, 8}));
        students[3] = (new Student("Zotov", "Petr", 101, new int[]{7, 8, 6, 8, 8}));
        students[4] = (new Student("Kotlov", "Petr", 102, new int[]{9, 10, 9, 10, 10}));
        students[5] = (new Student("Komlov", "Petr", 101, new int[]{7, 8, 9, 8, 8}));
        students[6] = (new Student("Pirogov", "Petr", 101, new int[]{6, 8, 9, 8, 8}));
        students[7] = (new Student("Kaz", "Petr", 102, new int[]{9, 10, 9, 10, 10}));
        students[8] = (new Student("Brown", "Petr", 101, new int[]{7, 8, 9, 8, 8}));
        students[9] = (new Student("Popov", "Petr", 101, new int[]{10, 10, 9, 10, 10}));

        for (int i = 0; i < students.length; i++) {
            if (students[i].isTopStudent()) {
                System.out.printf("\nA-level Student : %s, group %d", students[i].getSurname(), students[i].getGroup());
            }
        }
    }

}
