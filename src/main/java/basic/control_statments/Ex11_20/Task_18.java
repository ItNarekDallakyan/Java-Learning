package basic.control_statments.Ex11_20;

public class Task_18 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 12;
        int d = 24;

        if (d / c == c / b && c / b == b / a && d % c == c % b && c % b == b % a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
