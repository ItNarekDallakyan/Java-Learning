package basic.control_statments.Ex1_10;

public class Task_9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 5;

        int temp;
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        else if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        else if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }
        System.out.println(a + " "+ b + " "+ c) ;
    }
}
