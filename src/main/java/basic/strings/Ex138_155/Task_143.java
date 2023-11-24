package basic.strings.Ex138_155;

public class Task_143 {

    public static void main(String[] args) {
        String string1 = "123451563";
        String string2 = "";

        boolean t;
        for(int i = 0; i < string1.length() - 1; i++ ){
            t = true;
            for(int j = 0; j < string1.length(); j++){
                if(string1.charAt(i) == string1.charAt(j) && i!= j){
                    t = false;
                    break;
                }
            }
            if(t){
                string2 = string2 + string1.charAt(i);
            }
        }
        System.out.println(string2);
    }
}