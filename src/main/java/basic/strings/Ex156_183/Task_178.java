package basic.strings.Ex156_183;

public class Task_178 {

    public static void main(String[] args) {
        String string = "5681ghgfff145";
        int counter = 0;
        for(int i = 0; i < string.length(); i++){
            if( string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                counter++;
            }

            }
        System.out.println(counter);

   }
}
