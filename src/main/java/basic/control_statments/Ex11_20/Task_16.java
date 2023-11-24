package basic.control_statments.Ex11_20;

public class Task_16 {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = 5;
        int d = 9;

        if (a % 2 == 1 && b % 2 == 1) {
            System.out.println(1);
        }
        if (a % 2 == 1 && c % 2 == 1) {
            System.out.println(1);
        }

        if (a % 2 == 1 && d % 2 == 1) {
            System.out.println(1);
        }
        if (b % 2 == 1 && c % 2 == 1) {
            System.out.println(1);
        }
        if (b % 2 == 1 && d % 2 == 1) {
            System.out.println(1);
        }
        if (c % 2 == 1 && d % 2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
