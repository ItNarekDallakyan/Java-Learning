package basic.loops.Ex41_56;



public class Task_50 {

    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            int sqrt = (int)Math.sqrt(i * 16);
            if (sqrt * sqrt == i * 16) {
                System.out.println(i);
                break;
            }
        }
    }
}