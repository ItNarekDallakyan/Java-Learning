package basic.loops.Ex57_66;

public class Task_57 {

    public static void main(String[] args) {
        int N = 578945;
        int count=0;
        while(N > 0){
            N = N/10;
            count++;
        }
        System.out.print(count);
    }
}