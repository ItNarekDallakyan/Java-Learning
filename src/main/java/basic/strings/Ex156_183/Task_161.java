package basic.strings.Ex156_183;

public class Task_161 {

    public static void main(String[] args) {
        int n = 9;
        String string1 = "582548164"; //length = n

        int count = 0;
        for(int i = 1; i < string1.length()- 1 ; i++){
            if(string1.charAt(i-1)< string1.charAt(i) && string1.charAt(i) > string1.charAt(i+1)){
                count++;
            }
        }
            System.out.println(count);
   }
}