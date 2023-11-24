package basic.strings.Ex156_183;

public class Task_156 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "aaaaaacccccc"; //length = 2n
        int m = 3;
        String string2 = "bbb" ; //length = m
        String string3 = "";

        string3 += string1.substring(0,n);
        string3 += string2;
        string3 += string1.substring(n);

            System.out.println(string3);

    }
}