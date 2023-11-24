package basic.arrays.Ex68_87;

import java.util.Scanner;



public class Task_87 {

    public static void main(String[] args) {
        int n = 5;
        double array[]= new double[n];
        int k = 5;
        int count = 0;
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextDouble();
        }

        for(int i = 0; i < n; i++){
            if((int)Math.floor(array[i]) % k == 0){
                count++;
                sum += array[i];
            }
        }
        System.out.println(Math.pow(sum/count,2));
    }
}
