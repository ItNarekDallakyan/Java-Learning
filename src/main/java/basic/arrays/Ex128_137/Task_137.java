package basic.arrays.Ex128_137;

import java.util.Scanner;
public class Task_137 {

    public static void main(String[] args) {
        int n = 7;
        int X[]= new int[n];

        int Y[] = new int[n];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < X.length; i++){
            X[i]= input.nextInt();
        }

        int max = X[0];
        int indexMax = 0;
        for(int i = 0; i< n; i++){
            if(X[i] > max){
                max = X[i];
                indexMax = i;
            }
        }
        int min = X[0];
        int indexMin = 0;
        for(int i = 0; i< n; i++){
            if(X[i] <= min){
                min = X[i];
                indexMin = i;
            }
        }

        int j = 0;
        for(int i = 0; i < n; i++){
            if(i != indexMax && i != indexMin){
                Y[j] = X[i];
                j++;
            }
        }
        
        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}