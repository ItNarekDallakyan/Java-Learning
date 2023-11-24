package basic.arrays.Ex68_87;


import java.util.Scanner;

public class Task_77 {

    public static void main(String[] args) {
        int n = 4;
        int array[]= new int[n];
        int positiveNumCount = 0;
        int negativeNumCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] > 0){
               positiveNumCount++;
            }else{
                negativeNumCount++;
            }
        }
        System.out.println("Drakan tarreri qanak "+positiveNumCount+ "\n"+"Bacasakan tarreri qanak " + negativeNumCount);
    }
}