package basic.loops.Ex41_56;


public class Task_52 {

    public static void main(String[] args) {

        for (int i = 9999; i >= 1000; i--) {
            int sqrt = (int) Math.sqrt(i * 14);
            if (sqrt * sqrt == i * 14) {
                System.out.println(i);
                break;
            }
        }
    }
}