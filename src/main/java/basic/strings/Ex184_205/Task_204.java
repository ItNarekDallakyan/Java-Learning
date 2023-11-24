package basic.strings.Ex184_205;

public class Task_204 {

    public static void main(String[] args) {

        String S1 = "123456789";
        String S2 = "";
        for (int i = S1.length() - 2; i >= 0; i -= 2) {
            S2 += S1.charAt(i);
        }
        for (int i = S1.length() - 1; i >= 0; i -= 2) {
            S2 += S1.charAt(i);
        }
        System.out.println(S2);

        S1 = "";
        String str1 = S2.substring(S2.length() / 2); //kent index unecoxnernen
        String str2 = S2.substring(0, S2.length() / 2); //zuyg index unecoxnernen
        System.out.println("str2= " + str2 + "   str1= " + str1);
        if (str1.length() != str2.length()) {
            S1 += str1.charAt(str1.length() - 1);
        }
        for (int i = str2.length() - 1; i >= 0; i--) {
            S1 += str2.charAt(i);
            S1 += str1.charAt(i);
        }

        System.out.println(S1);
    }
}
