package epam.andrewpertsev.unit2_algorithmization.monoarray.task02_changer_element;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class ChangerArrayElement {
    public static void main(String[] args) {

        int ceiling = 5;
        int[] massive = new int[]{3, 6, 5, 8, 3, 1, 6, 5,};

        decrease(massive, ceiling);
    }


    public static void decrease(int massive[], int ceiling) {
        printArrayInt(" Initial Array :           ", massive);
        int replacements = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > ceiling) {
                massive[i] = ceiling;
                replacements++;
            }
        }
        printArrayInt("\n Array after replacements :", massive);
        System.out.println("\n We have done " + replacements + " replacements down to ceiling " + ceiling + ".");
    }


    public static void printArrayInt(String message, int[] massive) {
        System.out.print(message);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + (", "));

        }
    }

}
       
        