package basic.strings.Ex138_155;

public class Task_142 {

    public static void main(String[] args) {

        String string1 = "123465798";
        String string2 = "1bcdefgh8";


        int count = 0;
        for(int i = 0; i < string1.length(); i++ ){
            for(int j = 0; j < string2.length(); j++){
                if(string1.charAt(i) == string2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
            System.out.println(count);
    }
}