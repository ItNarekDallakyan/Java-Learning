package basic.loops.Ex57_66;

import static java.lang.Math.pow;

public class Task_61 {

    public static void main(String[] args) {
        int N = 8125486;
        int count=0;
        int n = N;
        while(n > 0){
            n = n/10;
            count++;
        }

        count = (int) pow(10,(count-1));
        while(count >= 1){
            System.out.print(N /count+" ");
            N =  N % count;
            count = count/10;
        }
    }
}