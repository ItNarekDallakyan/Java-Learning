package basic.control_statments.Ex21_30;

public class Task_25 {
    public static void main(String[] args) {
        int number = 142;
        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;

        int min = one;
        if(tens < min){
            min = tens;
        }
        if(hundreds < min){
            min = hundreds;
        }
        System.out.println(min);

    }
}
