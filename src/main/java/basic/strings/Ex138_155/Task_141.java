package basic.strings.Ex138_155;

public class Task_141 {

    public static void main(String[] args) {
        String string = "1z2345z89";

        int indexZ = 0;
        for(int i = 0; i < string.length(); i++ ){
            if(string.charAt(i) == 'z'){
                indexZ = i;
                break;
            }
        }
        int count = 0;
        for(int i = indexZ+1; i < string.length(); i++ ){
            if(string.charAt(i) == 'z')
                break;
            count++;
        }
        System.out.println(count);
    }
}