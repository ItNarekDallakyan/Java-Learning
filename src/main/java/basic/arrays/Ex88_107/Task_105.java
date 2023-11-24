package basic.arrays.Ex88_107;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task_105 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int sum = 0;
        int k = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(pow((array[i] + i),2) % k == 0){
                sum += array[i];
                System.out.println(array[i] + " "+i);
            }
        }
        System.out.println(sum);
    }
}
