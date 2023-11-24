package basic.loops.Ex41_56;

public class Task_44 {

    public static void main(String[] args) {
        int n = 11;
        int p = 1;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 3){
                p = p * i;
            }
        }
        System.out.println(p);

    }
}