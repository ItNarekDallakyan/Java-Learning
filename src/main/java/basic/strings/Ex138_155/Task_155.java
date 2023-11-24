package basic.strings.Ex138_155;

public class Task_155 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "cvdecf"; //length = n
        char c = 'z';

        boolean t = false;
        int count = 0;
        for( int i = 0; i < n; i++){
            if(string1.charAt(i) > c){
                t = true;
                break;
            }
        }
        if(t){
            for( int i = 0; i < n; i++){
                if(string1.charAt(i) == 'c'){
                    count ++;
                }
            }
            System.out.println("c paymananshanneri qanaky = "+count);
        }else{
            for( int i = 0; i < n; i++){
                if(string1.charAt(i) == 'd'){
                    count ++;
                }
            }
            System.out.println("d paymananshanneri qanaky = "+count);
        }


    }
}