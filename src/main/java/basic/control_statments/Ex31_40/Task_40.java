package basic.control_statments.Ex31_40;

public class Task_40 {
    public static void main(String[] args) {
        int number = 1562;

        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100 % 10;
        int thousands = number / 1000;
        int y;

        if(one * tens * hundreds * thousands > 200){
            y = 0;
        }else{
            y = 1;
        }
        System.out.println(y);
    }
}
