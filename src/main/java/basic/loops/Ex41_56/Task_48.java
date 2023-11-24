package basic.loops.Ex41_56;

public class Task_48 {

    public static void main(String[] args) {
        long p = 1;
        for(int i = 100; i <= 999; i++){
            if(i % 2 != 0  &&  i % 3 != 0){
                p = p * i;
                }
        }
        System.out.println(p);
    }
}