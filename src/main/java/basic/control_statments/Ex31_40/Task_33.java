package basic.control_statments.Ex31_40;

public class Task_33 {
    public static void main(String[] args) {
        int number = 8620;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;
        int thousands = number / 1000;

        if(one == 1 || tens == 1 || hundreds == 1 || thousands == 1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
