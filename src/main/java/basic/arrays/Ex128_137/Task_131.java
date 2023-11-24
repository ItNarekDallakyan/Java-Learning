package basic.arrays.Ex128_137;

import java.util.Scanner;

public class Task_131 {

    public static void main(String[] args) {
        int n = 7;
        int X[]= new int[n];

        int Y[] = new int[n*2];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < X.length; i++){
            X[i]= input.nextInt();
        }

        int j = 0;
        for(int i = 0; i < n; i++){
            Y[j] = X[i];
               if(X[i] > 0){
                   Y[j + 1] = 0;
                   j++;
               }
                j++;
        }

        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}