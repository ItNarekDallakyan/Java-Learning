package basic.strings.Ex156_183;

public class Task_179 {

    public static void main(String[] args) {
        String string = "AnhgDF125";
        int counter = 0;
        for(int i = 0; i < string.length(); i++){
            if( string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                counter++;
            }

            }
        System.out.println(counter);

   }
}
