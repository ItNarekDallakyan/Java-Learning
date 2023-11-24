package basic.arrays.Ex68_87;

import java.util.Scanner;

public class Task_74 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int p = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                p = p * (int)Math.pow(array[i],2);
            }
        }
        System.out.println(p);
    }
}
