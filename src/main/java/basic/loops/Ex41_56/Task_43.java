package basic.loops.Ex41_56;

public class Task_43 {

    public static void main(String[] args) {
        int n = 14;
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 2){
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}