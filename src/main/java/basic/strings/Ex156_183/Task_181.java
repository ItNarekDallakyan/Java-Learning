package basic.strings.Ex156_183;

public class Task_181 {

    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("AnhgDF125");
        for (int i=0; i < string.length(); i++)
        {
            Character c = string.charAt(i);
            if (Character.isLowerCase(c))
                string.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                string.replace(i, i+1, Character.toLowerCase(c)+"");

        }

        System.out.println(string);

   }
}
