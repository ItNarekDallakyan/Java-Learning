package basic.strings.Ex184_205;

public class Task_185 {

    public static void main(String[] args) {
        String str = "4-2+3+6";
        int calculator = Character.getNumericValue(str.charAt(0));
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '+'){
                calculator = calculator + Character.getNumericValue(str.charAt(i+1));
            }
            if(str.charAt(i) == '-'){
                calculator = calculator - Character.getNumericValue(str.charAt(i+1));
            }
        }
        System.out.print(calculator);
   }
}
