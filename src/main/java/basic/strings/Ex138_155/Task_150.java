package basic.strings.Ex138_155;

public class Task_150 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "c5dccf"; //length = n
        boolean t = false;
        int count = 0;
        for(int i = 0; i < n ; i ++ ){
            if(string1.charAt(i) == 'x'){
                t = true;
                break;
            }
        }
        if(t){
            for( int i = 0;i< n; i++){
                if(string1.charAt(i) == 'c')
                    count++;
            }
            System.out.println("c paymananshanneri qanaky = "+ count);
        }else {
            for (int i = 0; i < n; i++) {
                if (string1.charAt(i) == 'd')
                    count++;
            }
            System.out.println("d paymananshanneri qanaky = " + count);
        }
    }
}