package basic.loops.Ex57_66;

public class Task_63 {

    public static void main(String[] args) {
        int N = 13456789;
        boolean t = false;
        while(N > 0){
            if(N % 10 == 2){
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