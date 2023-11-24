package basic.strings.Ex138_155;

public class Task_151 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "c5dccf"; //length = n
        String string2 = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                string2 += 'a';
            } else
                string2 += string1.charAt(i);
        }

    }
}