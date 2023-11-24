package basic.control_statments.Ex31_40;

public class Task_32 {
    public static void main(String[] args) {
        int number = 1986;


        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;
        int thousands = number / 1000;

        if(number < 5000){
            System.out.println(number/ (one + hundreds));
        }else{
            System.out.println(number/(tens + thousands));
        }
    }
}
