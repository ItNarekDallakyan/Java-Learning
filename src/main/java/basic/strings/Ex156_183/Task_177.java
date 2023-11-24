package basic.strings.Ex156_183;

public class Task_177 {

    public static void main(String[] args) {
        int N = 5;
        StringBuilder str = new StringBuilder("abdfgge");

        for(int i = 1; i <= str.length(); i+=N+1){
            for(int j = 0 ; j < N; j++)
             str.insert(i, ',');

            }
        System.out.println(str.toString());

   }
}