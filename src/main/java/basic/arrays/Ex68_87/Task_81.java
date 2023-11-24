package basic.arrays.Ex68_87;

import java.util.Scanner;


public class Task_81 {

    public static void main(String[] args) {
        int n = 4;
        int array[]= new int[n];
        int k = 5;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(Math.abs(array[i]) < k){
               sum += Math.pow(array[i],3);
            }
        }
        System.out.println(sum);
    }
}