package basic.control_statments.Ex21_30;

public class Task_24 {
    public static void main(String[] args) {
        int number = 642;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;

        int max = one;
        if(tens > max){
            max = tens;
        }
        if(hundreds > max){
            max = hundreds;
        }
        System.out.println(max);
    }
}
