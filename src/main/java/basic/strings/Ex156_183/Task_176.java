package basic.strings.Ex156_183;

public class Task_176 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("abdfgge");

        for(int i = 1; i <= str.length(); i+=2){
             str.insert(i, ' ');
            }
        System.out.println(str.toString());

   }
}
