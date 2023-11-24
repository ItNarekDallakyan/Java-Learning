package basic.loops.Ex41_56;


public class Task_54 {

    public static void main(String[] args) {
        int n = 14;

        for (int i = 100; i <= 999; i++) {
            if (Math.sqrt(i) > n) {
                System.out.println(i);
                break;
            }
        }
    }
}