package basic.control_statments.Ex21_30;

public class Task_27 {
    public static void main(String[] args) {
        int number = 282;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;

        if(number > 300){
            System.out.println(tens / one);
        }else{
            System.out.println(hundreds / one);
        }
    }
}
