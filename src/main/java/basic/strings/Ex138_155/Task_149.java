package basic.strings.Ex138_155;

public class Task_149 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "axagyx"; //length = n
        String string2 = "";

        for(int i = 0; i < n ; i += 2 ){
            if(string1.charAt(i) > string1.charAt(i+1)){
                string2 += string1.charAt(i);
            }else
                string2 += string1.charAt( i + 1);
        }

        System.out.println(string2);
    }
}