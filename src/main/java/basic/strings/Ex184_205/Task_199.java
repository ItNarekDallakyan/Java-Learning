package basic.strings.Ex184_205;

public class Task_199 {

    public static void main(String[] args) {

        String str1 = "ahg kljgdo      sdjfhlksg njhgd;h jhh                 kjk";
        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.replaceAll("  ", " ");
        }
        

        System.out.print(str1);
    }
}