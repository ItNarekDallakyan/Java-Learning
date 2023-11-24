package basic.control_statments.Ex1_10;

public class Task_5 {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 2;

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }
    }
}