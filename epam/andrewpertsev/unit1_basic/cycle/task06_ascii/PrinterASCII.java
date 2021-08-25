package epam.andrewpertsev.unit1_basic.cycle.task06_ascii;//

// 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class PrinterASCII {
    public static void main(String[] args) {

        System.out.print("code  symbol\n");

        for (int i = 0; i < 256; i++) {
            char ch = (char) i;
            System.out.printf("%3d %4s\n", i, ch);
        }

    }
}





//        Integer.toHexString(i);
