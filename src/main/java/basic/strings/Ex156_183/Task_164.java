package basic.strings.Ex156_183;

public class Task_164 {

    public static void main(String[] args) {
        int n = 11;
        String string1 = "Mnacakanyan"; // length = 11
        boolean t;

        if (string1.contains("yan")) {
            t = true;
        } else {
            t =false;
        }
        System.out.println(t);
    }

/* if(string1.substring(n - 3, n ).equals("yan"))
    t = true;
        System.out.println(t);*/
}