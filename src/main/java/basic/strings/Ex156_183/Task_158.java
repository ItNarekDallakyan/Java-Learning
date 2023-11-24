package basic.strings.Ex156_183;

public class Task_158 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "azvbzx"; //length = n
        int sum = 0;
        int p = 1;

        for(int i = 0; i < n; i++){
            if(string1.charAt(i) == 'z'){
                sum += i;
                p *= i;
            }
        }
        
        System.out.println("gumary = " + sum+"\nartadryaly = "+p);

    }
}
