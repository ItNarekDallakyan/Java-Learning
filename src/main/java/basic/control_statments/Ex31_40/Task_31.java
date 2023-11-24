package basic.control_statments.Ex31_40;

public class Task_31 {
    public static void main(String[] args) {

        int number = 5986;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;
        int thousands = number / 1000;
        boolean t;

        if(one + tens == hundreds + thousands){
            t = true;
        }else{
            t = false;
        }
        System.out.println(t);


    }
}
