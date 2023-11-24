package basic.strings.Ex138_155;

import java.util.Scanner;

public class Task_139 {

    public static void main(String[] args) {
        int n = 8;
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

        boolean t = false;
        for(int i = 0; i < n/2; i++ ){
            if(string.charAt(i) == string.charAt(n-i-1)){
                t = true;
            }else{
                t = false;
                break;
            }
        }
            System.out.println(t);
    }
}
