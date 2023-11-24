package basic.strings.Ex156_183;

public class Task_157 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "12345kkk12345"; //length = 2n +1
        String string2 = "";

        string2 = string2.concat(string1.substring(0,(2*n+1)/2-1)) ;
        string2 = string2.concat( string1.substring((2*n+1)/2+2));

        System.out.println(string2);

    }
}