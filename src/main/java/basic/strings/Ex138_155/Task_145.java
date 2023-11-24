package basic.strings.Ex138_155;

public class Task_145 {

    public static void main(String[] args) {
        int n = 9;
        String string1 = "abageadwm";
        String string2 = "";


        for(int i = 0; i < n ; i++ ){
            string2 += string1.charAt(i);
            if(string1.charAt(i) == 'a'){
                    string2 += 'c';
                }
            }

        System.out.println(string2);
    }
}