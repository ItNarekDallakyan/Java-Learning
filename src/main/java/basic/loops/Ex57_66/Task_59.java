package basic.loops.Ex57_66;

public class Task_59 {

    public static void main(String[] args) {
        int N = 465;
        int p = 1;
        while(N > 0){
           p = p * (N % 10);
           N = N/10;
        }
        System.out.print(p);
    }
}
