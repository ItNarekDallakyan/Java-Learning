package basic.control_statments.Ex21_30;

public class Task_28 {
    public static void main(String[] args) {
        int number = 249;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;
        char f;

        if(tens + hundreds < 5){
            f = 'a';
        }else{
            f ='b';
        }
        System.out.println(f);
    }
}
