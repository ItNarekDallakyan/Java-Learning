package basic.strings.Ex184_205;

public class Task_191 {

    public static void main(String[] args) {

        String str1 = "ABC 12345  DEF lk; f    g";
        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.replaceAll("  ", " ");
        }
        String str2[] = str1.split(" ");

        System.out.print(str2.length);
    }
}
