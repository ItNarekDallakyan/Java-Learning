package basic.arrays.Ex68_87;

import java.util.Scanner;

public class Task_78 {

    public static void main(String[] args) {
        int n = 4;
        int array[]= new int[n];
        int a = 4;
        int b = 10;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] >= a && array[i] <= b){
               sum+=array[i] ;
            }
        }
        System.out.println(sum);
    }
}