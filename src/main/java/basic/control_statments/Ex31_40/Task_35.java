package basic.control_statments.Ex31_40;

public class Task_35 {
    public static void main(String[] args) {
        int number = 1243;

        int one = number % 10;
        int tens = number % 100 / 10;

        if(one * tens == 12 ){
            System.out.println("y=12");
        }else{
            System.out.println("y=0");
        }
    }
}
