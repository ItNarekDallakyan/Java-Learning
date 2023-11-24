package basic.control_statments.Ex11_20;

public class Task_15 {
    public static void main(String[] args) {
        int a = 4;
        int b = 17;
        int c = 5;
        int d = 8;
        if(a + b + c == d ){
            System.out.println(true);        }
       else if(a + c + d == b ){
            System.out.println(true);
        }
        else if(b + c + d == a){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
