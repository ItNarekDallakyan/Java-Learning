package basic.loops.Ex57_66;

public class Task_66 {

    public static void main(String[] args) {
        int N = 1254;
        int sum1 = 0;
        int sum2 = 0;
        int count=0;
        int n = N;
        while(n > 0){
            n = n/10;
            count++;
        }
        for(int i= count; i >=1;i--){
            if(i % 2 == 0){
                sum2 = sum2 + N%10;
            }else{
                sum1 = sum1 + N%10;
            }
            N = N/10;
        }

        if(sum1 == sum2){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
