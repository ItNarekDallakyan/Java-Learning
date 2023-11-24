package basic.arrays.Ex118_127;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task_124 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int k = 3;

        int Y[] = new int[array.length];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            if(abs(array[i]) <= k  ){
                Y[j] = array[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}
