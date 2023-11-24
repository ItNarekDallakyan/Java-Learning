package basic.control_statments.Ex31_40;

public class Task_38 {
    public static void main(String[] args) {
        int number = 1235;
        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;

        if(one > tens){
            System.out.println(one * hundreds);
        }else{
            System.out.println("1");
        }
    }
}
