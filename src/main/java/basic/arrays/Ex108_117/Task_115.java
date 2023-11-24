package basic.arrays.Ex108_117;

import java.util.Scanner;
public class Task_115 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }

        int temp;
        int maxIndex = 0;
        int max = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] >= max ){
                temp = array[i];
                array[i] = max;
                max = temp;
                maxIndex = i;
            }
        }
        System.out.println( maxIndex);
    }
}