package basic.control_statments.Ex11_20;

public class Task_11 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 5;
        int d = 9;

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }
        System.out.println(max);
    }
}
