package basic.strings.Ex156_183;

public class Task_172 {

    public static void main(String[] args) {

        char X = '*';
        if(X >= '0' && X <= '9')
            System.out.print("1");
        else
        if(X >= 'A' && X <= 'Z')
            System.out.print("2");
        else
        if(X >= 'a' && X <= 'z')
            System.out.print("3");
        else
            System.out.println("4");

   }
}
