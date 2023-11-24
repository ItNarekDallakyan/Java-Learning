package basic.control_statments.Ex11_20;

public class Task_14 {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 5;
        int d = 8;

        if(a + b == c + d ){
            System.out.println(true);        }
       else if(a + c == b + d ){
            System.out.println(true);
        }
       else if(a + d == b + c ){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
