package basic.control_statments.Ex31_40;

public class Task_37 {
    public static void main(String[] args) {
        int number = 4564;
        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;
        int thousands = number / 1000;

        if(number == Math.pow((one + tens + hundreds + thousands),2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
