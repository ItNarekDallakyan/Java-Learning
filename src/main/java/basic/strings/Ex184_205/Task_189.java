package basic.strings.Ex184_205;

public class Task_189 {

    public static void main(String[] args) {

        String str1 = "ABC 12345 DEF lk; fg";
        String str2[] = str1.split(" ");

        System.out.print(str2[1]);
   }
}
