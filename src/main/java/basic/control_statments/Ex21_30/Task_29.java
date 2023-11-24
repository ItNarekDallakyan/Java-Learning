package basic.control_statments.Ex21_30;

public class Task_29 {
    public static void main(String[] args) {
        int number = 198;
        int one = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;
        int temp;

        if(hundreds > tens){
            temp = hundreds;
            hundreds = tens;
            tens = temp;
        }
        if(tens > one){
            temp = one;
            one = tens;
            tens = temp;
        }
        if(hundreds > tens){
            temp = hundreds;
            hundreds = tens;
            tens = temp;
        }

        System.out.println(hundreds + " " + tens + " " + one);
    }
}
