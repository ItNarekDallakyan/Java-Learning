package basic.arrays.Ex128_137;

import java.util.Scanner;


public class Task_129 {

    public static void main(String[] args) {
        int n = 6;
        int X[]= new int[n];

        int Y[] = new int[X.length];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < X.length; i++){
            X[i]= input.nextInt();
        }

        int j = 0;
        for(int i = 0; i < n-1; i+=2){
            if(Math.abs(X[i]) > Math.abs(X[i+1])){
                Y[j] = X[i] ;
            }else{
                Y[j] = X[i+1];
            }
            j++;
        }

        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}