package basic.strings.Ex138_155;

public class Task_148 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "axagxx"; //length = n
        String string2 = "";

        for(int i = 0; i < n ; i++ ){
            if(string1.charAt(i) == 'x'){
                string2 += "yy";
            }else
                string2 += string1.charAt( i );
        }

        System.out.println(string2);
    }
}