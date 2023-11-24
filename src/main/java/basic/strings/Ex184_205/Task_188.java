package basic.strings.Ex184_205;

public class Task_188 {

    public static void main(String[] args) {

        String str1 = "ABCjkhlBCD12ABC";
        String str2 = "ABC";
        str1 = str1.replaceAll(str2,"&");
        int index = 0;
        for(int i = 1 ;i < str1.length(); i++){
            if(str1.charAt(i) == '&' ){
                index = i +str2.length()-1 ;
            }
        }
        System.out.print(index);
   }
}