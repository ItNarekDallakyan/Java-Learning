package basic.arrays.Ex108_117;

import java.util.Scanner;
public class Task_111 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }

        int min = array[0];
        int temp;
        for(int i = 1; i < n; i++){
            if(array[i] < min ){
                temp = array[i];
                array[i] = min;
                min = temp;
            }
        }
        int max = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] > max ){
                temp = array[i];
                array[i] = max;
                max = temp;
            }
        }
        System.out.println(max * min);
    }
}