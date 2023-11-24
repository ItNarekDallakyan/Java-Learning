package basic.loops.Ex57_66;

public class Task_65 {

    public static void main(String[] args) {
        int N = 68;
        boolean t = false;
        while(N > 0){
            if(N % 10 % 2 == 1){
                t = true;
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