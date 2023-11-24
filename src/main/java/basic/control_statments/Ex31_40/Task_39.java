package basic.control_statments.Ex31_40;

public class Task_39 {
    public static void main(String[] args) {
        int number = 9285;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;
        int thousands = number / 1000;
        int y;

        if(one + tens + hundreds + thousands > 20){
            y = 1;
        }else{
            y = 0;
        }
        System.out.println(y);

    }
}
