package basic.control_statments.Ex21_30;

public class Task_26 {
    public static void main(String[] args) {
        int number = 142;
        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;

        if(one > tens){
            System.out.println(number/(one + tens + hundreds));
        }else{
            System.out.println(number);
        }
    }
}
