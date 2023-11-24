package basic.arrays.Ex128_137;

import java.util.Scanner;

public class Task_130 {

    public static void main(String[] args) {
        int n = 7;
        int X[]= new int[n];

        int Y[] = new int[X.length];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < X.length; i++){
            X[i]= input.nextInt();
        }

        int j = 0;
        for(int i = 1; i < n-1; i+=2){
                Y[j] = X[i+1] ;
                Y[j+1] = X[i];
                j+=2;
        }

        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}