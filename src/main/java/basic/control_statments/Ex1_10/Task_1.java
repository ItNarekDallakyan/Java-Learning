package basic.control_statments.Ex1_10;

public class Task_1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        int max = 0;

        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c>b) {
            max = c;
        }
        System.out.println(max);

    }
}
