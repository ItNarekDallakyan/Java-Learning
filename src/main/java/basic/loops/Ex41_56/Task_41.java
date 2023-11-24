package basic.loops.Ex41_56;

public class Task_41 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
