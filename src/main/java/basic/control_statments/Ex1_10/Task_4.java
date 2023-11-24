package basic.control_statments.Ex1_10;

public class Task_4 {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 3;

        if (a == 2 && b == 2 && c != 2) {
            System.out.println(true);
        } else if (a == 2 && b != 2 && c == 2) {
            System.out.println(true);
        } else if (a != 2 && b == 2 && c == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
