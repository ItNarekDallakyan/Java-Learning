package basic.strings.Ex156_183;

public class Task_167 {

    public static void main(String[] args) {

        //method 1
        char character = 'j';
        int ascii = (int) character;
        System.out.println(ascii);

        //method 2
        String character2 = "a";
        System.out.println(character2.codePointAt(0));

   }
}