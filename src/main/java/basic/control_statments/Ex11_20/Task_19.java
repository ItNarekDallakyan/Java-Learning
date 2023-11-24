package basic.control_statments.Ex11_20;

public class Task_19 {
    public static void main(String[] args) {
        int a = 3;
        int b = 13;
        int c = 12;
        int d = 24;
        int temp;
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (a > d) {
            temp = a;
            a = d;
            d = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (b > d) {
            temp = b;
            b = d;
            d = temp;
        }
        if (c > d) {
            temp = c;
            c = d;
            d = temp;
        }
        System.out.println(a + " "+ b + " "+ c + " "+ d) ;
    }
}
