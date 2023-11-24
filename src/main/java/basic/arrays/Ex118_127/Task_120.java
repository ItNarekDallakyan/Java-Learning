package basic.arrays.Ex118_127;

import java.util.Scanner;
public class Task_120 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int a = 1;
        int b = 5;

        int Y[] = new int[array.length];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            if(array[i] < a || array[i] > b ){
                Y[j] = array[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}