package basic.loops.Ex41_56;

public class Task_47 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 100; i <= 999; i++){
            if(i % 5 != 0 ){
                sum = sum + i;
                }
        }
        System.out.println(sum);
    }
}