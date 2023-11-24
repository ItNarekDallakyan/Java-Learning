package basic.strings.Ex156_183;

public class Task_173 {

    public static void main(String[] args) {

       String string = "aghkdkgdls";
        char firstCase = string.charAt(0);
        char lastCase = string.charAt(string.length() - 1);
        System.out.println(firstCase + "  "+(int)firstCase);
        System.out.println(lastCase + "  "+(int)lastCase);
   }
}
