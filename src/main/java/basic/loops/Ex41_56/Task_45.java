package basic.loops.Ex41_56;

public class Task_45 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 10; i <= 99; i++){
            if(i % 3 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}