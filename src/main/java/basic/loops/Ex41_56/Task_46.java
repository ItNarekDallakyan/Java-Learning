package basic.loops.Ex41_56;

public class Task_46 {

    public static void main(String[] args) {
        long p = 1;
        for(int i = 10; i <= 99; i++){
            if(i % 3 == 0 && i % 5 == 0){
                p = p * i;
             }
        }
        System.out.println(p);

    }
}