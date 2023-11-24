package basic.strings.Ex138_155;

import java.util.Scanner;

public class Task_138 {

    public static void main(String[] args) {
        int n = 7;
        String string ;

         Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Nermucel " + n + " erkarutyamb tox");
            string = input.nextLine();
            if (string.length() > n) {
                System.out.println("Nermucel eq " + string.length() + " erkarutyamb tox");
            } else {
                if (string.length() < n) {
                    System.out.println("Nermucel eq " + string.length() + " erkarutyamb tox");
                } else {
                    break;
                }
            }
        }

        int count =0;
        for(int i = 0; i < n; i++ ){
            if(string.charAt(i) == 'a'){
                count++;
            }
        }
            System.out.println(count);
    }
}