package epam.andrewpertsev.unit1_basic.cycle.task08_common_number;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class CommonNumber {
    public static void main(String[] args) {
        int i =0;
        int numberA = 7123000;
        int numberB = 9123456;
        System.out.println(" First number  : " + numberA);
        System.out.println(" Second number : " + numberB);


        while (numberA > 0) {

            int temp = numberB;
            i = numberA % 10;
            numberA = numberA / 10;

            while (temp > 0) {
                int j = temp % 10;
                temp = temp / 10;

                if (i == j) {
                    System.out.printf(" Common number is : %d \n",  j );

                }
            }


        }
    }
}
