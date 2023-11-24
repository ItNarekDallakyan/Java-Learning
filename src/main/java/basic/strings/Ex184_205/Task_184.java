package basic.strings.Ex184_205;

public class Task_184 {

    public static void main(String[] args) {
        String str = "4236";
        int sum = 0;
        for(int i = str.length()-1; i >= 0; i--) {
            sum +=Character.getNumericValue(str.charAt(i));
        }
        System.out.print(sum);
   }
}
