package basic.strings.Ex184_205;

public class Task_187 {

    public static void main(String[] args) {

        String str1 = "123jkhl123";
        String str2 = "123";
        str1 = str1.replaceAll(str2,"&");
        int count = 0;
        for(int i = 0 ;i< str1.length(); i++){
            if(str1.charAt(i) == '&'){
                count++;
            }
        }
        System.out.print(count);
   }
}