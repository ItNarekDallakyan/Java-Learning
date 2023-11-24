package basic.control_statments.Ex11_20;

public class Task_12 {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 5;
        int d = 9;

        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        if(d < min){
            min = d;
        }
        System.out.println(min);

    }
}
