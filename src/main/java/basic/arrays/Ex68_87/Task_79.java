package basic.arrays.Ex68_87;

import java.util.Scanner;

public class Task_79 {

    public static void main(String[] args) {
        int n = 4;
        int array[]= new int[n];
        int c = 4;
        int d = 10;
        int p = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] >= c && array[i] < d){
               p *=array[i] ;
            }
        }
        System.out.println(p);
    }
}