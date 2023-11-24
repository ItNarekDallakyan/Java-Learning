package basic.strings.Ex156_183;

public class Task_160 {

    public static void main(String[] args) {
        int n = 4;
        String string1 = "aaghbhgaa"; //length = 2n+1

        int count = 0;

        boolean t = true;
        for(int i = 0; i <= string1.length()/2 ; i++){
            if(string1.charAt(i) != string1.charAt(2*n-i)){
                t = false;
            }
        }
        if(t){
            for(int i = 0 ; i<string1.length();i++){
                if(string1.charAt(i) == 'a')
                    count++;
            }
            System.out.println("a paymananshanneri qanaky = "+ count);
        }else{
            for(int i = 0 ; i<string1.length();i++){
                if(string1.charAt(i) == 'b')
                    count++;
            }
            System.out.println("b paymananshanneri qanaky = "+ count);
        }


   }
}