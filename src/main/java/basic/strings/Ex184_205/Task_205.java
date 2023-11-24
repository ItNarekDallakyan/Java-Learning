package basic.strings.Ex184_205;

public class Task_205 {

    public static void main(String[] args) {

        String str = "1abcd45ujk";
        str = str.replaceAll("[^a-z]", "");
        System.out.println(str);
        char[] strchar = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                if (String.valueOf(strchar[i]).compareTo(String.valueOf((strchar[j]))) < 0) {
                    char temp = strchar[i];
                    strchar[i] = strchar[j];
                    strchar[j] = temp;
                }
            }
        }
        int j;
        for (j = 0; j < str.length(); j++) {
            if (strchar[j] != str.charAt(j)) {
                System.out.println(str.charAt(j));
                j = -1;
                break;
            }
        }
        if (j > 0)
            System.out.println("1");
        String b = new String(strchar);
        System.out.println(b);
    }
}
