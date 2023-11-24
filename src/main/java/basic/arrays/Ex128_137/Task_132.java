package basic.arrays.Ex128_137;

import java.util.Scanner;

public class Task_132 {

    public static void main(String[] args) {
        int n = 7;
        int X[]= new int[n];
        int b = -4;
        boolean t = false;

        int Y[] = new int[n];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < X.length; i++){
            X[i]= input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(X[i] < b){
                t = true;
                break;
            }
        }
        int j = 0;
        if(t){
            for(int i = 0; i < n; i++){
                 if(X[i] > 0){
                    Y[j] = X[i];
                    j++;
                }
            }
        }else{
            for(int i = 0; i < n; i++){
                if(X[i] < 0){
                    Y[j] = X[i];
                    j++;
                }
            }
        }

        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}