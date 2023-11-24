package basic.loops.Ex57_66;


public class Task_62 {

    public static void main(String[] args) {
        int N = 123456789;
        int newN = 0;

        int count = 0;
        int n = N;
        while(n > 0){
            n = n/10;
            count++;
        }
        count = (int) Math.pow(10,(count-1));
        while(N > 0){
            newN = newN + N%10*count;
            count=count/10;
            N = N/10;
        }
        System.out.print(newN);
    }
}