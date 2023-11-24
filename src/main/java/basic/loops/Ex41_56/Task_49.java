package basic.loops.Ex41_56;

public class Task_49 {

    public static void main(String[] args) {
        double p = 1;
        for(int i = 100; i <= 999; i++){
            if(i % 3 == 1  &&  i % 4 == 2){
                p = p * i;
               }
        }
        System.out.println(p);
    }
}