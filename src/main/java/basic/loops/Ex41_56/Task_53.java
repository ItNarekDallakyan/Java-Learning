package basic.loops.Ex41_56;


public class Task_53 {

    public static void main(String[] args) {

        for (int i = 9999; i >= 1000; i--) {
            int sqrt = (int)Math.sqrt(i * 18);
            if (sqrt * sqrt == i * 18) {
                System.out.println(i);
                break;
            }
        }
    }
}