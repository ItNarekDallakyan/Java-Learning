package basic.arrays.Ex68_87;

import java.util.Scanner;

public class Task_83 {

    public static void main(String[] args) {
        int n = 4;
        int array[]= new int[n];
        int k = 5;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(Math.abs(array[i]) < k){
               count++;
            }
        }
        System.out.println(count);
    }
}