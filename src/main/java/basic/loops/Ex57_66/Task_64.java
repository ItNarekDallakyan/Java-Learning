package basic.loops.Ex57_66;

public class Task_64 {

    public static void main(String[] args) {
        int N = 222222;
        boolean t = false;
        while(N > 10){
            if(N % 10 == N%100/10){
                t = true;

            }else {
                t = false;
                break;
            }
            N = N/10;
        }
        if(t){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}