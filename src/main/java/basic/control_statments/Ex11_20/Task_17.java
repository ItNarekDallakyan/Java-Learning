package basic.control_statments.Ex11_20;

public class Task_17 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 8;
        int d = 10;
        if (d - c == c - b && c - b == b - a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
