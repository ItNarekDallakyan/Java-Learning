package basic.control_statments.Ex1_10;

public class Task_10 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 5;
        int temp;

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
         if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
         if (a < b) {
            temp = b;
            b = a;
            a = temp;
        }
        System.out.println(a + " "+ b + " "+ c) ;
    }
}
