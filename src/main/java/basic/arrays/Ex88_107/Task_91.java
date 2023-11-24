package basic.arrays.Ex88_107;

import java.util.Scanner;

public class Task_91 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] % 2 != 0){
                sum += array[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }
}