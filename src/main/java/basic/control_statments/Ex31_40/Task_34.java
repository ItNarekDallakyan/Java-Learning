package basic.control_statments.Ex31_40;

public class Task_34 {
    public static void main(String[] args) {
        int number = 1223;
        int one = number % 10;
        int tens = number % 100 / 10;

        char y;

        if(one + tens == 5 ){
            y = 's';
        }else{
            y = 'd';
        }
        System.out.println(y);
    }
}
