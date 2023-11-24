package basic.loops.Ex41_56;

public class Task_55 {

    public static void main(String[] args) {
        int n = 9;
        boolean t = false;
        if (n % 3 == 0) {
           for (int i = 1; i <= n/3; i++) {
                if (Math.pow(3, i) == n)
                    t = true;
            }
        }
        System.out.print(t);
    }     
}
