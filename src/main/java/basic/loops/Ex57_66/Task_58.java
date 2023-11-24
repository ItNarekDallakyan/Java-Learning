package basic.loops.Ex57_66;

public class Task_58 {

    public static void main(String[] args) {
        int N = 8945;
        int sum = 0;
        while(N > 0){
           sum = sum + N % 10;
           N = N/10;
        }
        System.out.print(sum);
    }
}
