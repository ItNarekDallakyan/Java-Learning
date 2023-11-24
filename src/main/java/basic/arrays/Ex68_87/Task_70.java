package basic.arrays.Ex68_87;

import java.util.Scanner;


public class Task_70 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Please insert " + n + " elements");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] < 0){
                count++;
                sum += array[i];
            }
        }
        System.out.println(Math.pow(sum/count,2));
    }
}