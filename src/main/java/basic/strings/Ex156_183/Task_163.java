package basic.strings.Ex156_183;

public class Task_163 {

    public static void main(String[] args) {
        String string1 = "abxcjf";
        String string2 = "12345";
        String string3 = "";

        int indexX = string1.indexOf('x');

        string3 += string1.substring(0, indexX) + string2 + string1.substring(indexX + 1);
        System.out.println(string3);
    }
}
