package basic.strings.Ex156_183;

public class Task_166 {

    public static void main(String[] args) {
        int n = 18;
        String string1 = "hgfab hjugba gglab"; // length = n

        string1 = string1.replaceAll("ab","");

        System.out.println(string1);
   }
}