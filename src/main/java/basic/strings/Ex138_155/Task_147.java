package basic.strings.Ex138_155;

public class Task_147 {

    public static void main(String[] args) {
        int n = 3;
        String string1 = "abagdwm"; //length = 2n + 1
        String string2 = "";

        for(int i = 0; i < string1.length() ; i++ ){
                string2 += string1.charAt(2*n - i );
        }

        System.out.println(string2);
    }
}