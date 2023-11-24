package basic.arrays.Ex68_87;

import java.util.Scanner;

public class Task_73 {

    public static void main(String[] args) {
        int n = 4;
        int array[]= new int[n];
        int p = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
               p *= array[i];
            }
        }
        System.out.println(p);
    }
}