package basic.arrays.Ex88_107;

import java.util.Scanner;

public class Task_99 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int m = 3;
        int p = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] % m == 0){
                p *= array[i];
            }
        }
        System.out.println(p);
    }
}
