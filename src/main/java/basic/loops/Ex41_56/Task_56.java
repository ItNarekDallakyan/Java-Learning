package basic.loops.Ex41_56;

public class Task_56 {

    public static void main(String[] args) {
        int n = 16;
        int y = 0;
        if (n % 4 == 0) {
           for (int i = 1; i <= n/4; i++) {
                if (Math.pow(4, i) == n)
                    y = 1;

            }
        }
        System.out.print(y);
    }
}
