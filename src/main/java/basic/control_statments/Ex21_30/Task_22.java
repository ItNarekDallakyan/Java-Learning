package basic.control_statments.Ex21_30;

public class Task_22 {
    public static void main(String[] args) {
        int number = 443;

        boolean t;
        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;

        if(one == tens || one == hundreds || tens == hundreds){
            t = true;
        }else{
            t = false;
        }
        System.out.println(t);
    }
}
