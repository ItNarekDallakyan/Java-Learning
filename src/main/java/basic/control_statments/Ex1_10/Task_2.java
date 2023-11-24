package basic.control_statments.Ex1_10;

public class Task_2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        int min = 0;

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }
        System.out.println(min);

    }
}
