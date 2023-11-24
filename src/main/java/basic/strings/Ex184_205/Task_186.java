package basic.strings.Ex184_205;

public class Task_186 {

    public static void main(String[] args) {
        char c = 'X';
        String str1 = "abgfXsdXb";
        String str2 = "111";

        str1 = str1.replaceAll(String.valueOf(c),str2);
        System.out.print(str1);
   }
}
