package basic.strings.Ex138_155;

public class Task_144 {

    public static void main(String[] args) {

        String string1 = "abcdeadwm";
        String string2 = "1b9asm2de";
        String string3 = "";


        for(int i = 0; i < string2.length() ; i++ ){
            for(int j = 0; j < string1.length(); j++){
                if(string2.charAt(i) == string1.charAt(j)){
                    string3 = string3 + string2.charAt(i);
                    break;
                }
            }
        }
            System.out.println(string3);
    }
}