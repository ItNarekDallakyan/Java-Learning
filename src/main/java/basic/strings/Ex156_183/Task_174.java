package basic.strings.Ex156_183;

public class Task_174 {

    public static void main(String[] args) {
        int N = 5;
        char X = 'a';
        String string = String.valueOf(X);
        for( int i = 0; i< N-1 ; i++){
             string += 'a';
        }

        System.out.print(string);

   }
}
