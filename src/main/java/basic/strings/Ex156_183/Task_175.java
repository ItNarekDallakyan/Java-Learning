package basic.strings.Ex156_183;

public class Task_175 {

    public static void main(String[] args) {
        int N = 8;
        char X = 'a';
        char Y = 'b';
        String xy = String.valueOf(X) + String.valueOf(Y);
        String string = "";
        for( int i = 0; i < N/2 ; i++){
             string += xy ;
        }

        System.out.print(string);

   }
}