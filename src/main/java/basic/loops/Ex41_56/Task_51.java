package basic.loops.Ex41_56;


public class Task_51 {

    public static void main(String[] args) {

        for (int i = 1000; i <= 9999; i++) {
            int sqrt = (int)Math.sqrt(i * 26);
            if (sqrt * sqrt == i * 26) {
                System.out.println(i);
                break;
            }
        }
    }
}