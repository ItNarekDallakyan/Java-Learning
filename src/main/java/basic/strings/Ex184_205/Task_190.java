package basic.strings.Ex184_205;

public class Task_190 {

    public static void main(String[] args) {

        String str1 = "ABC 12345 DEF lk; fg";
        String str2[] = str1.split(" ");
        str1 = "";
        for (int i = 1; i < str2.length - 1; i++) {
            str1 += str2[i];
        }

        System.out.print(str1);
    }
}