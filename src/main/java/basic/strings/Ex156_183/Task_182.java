package basic.strings.Ex156_183;

public class Task_182 {

    public static void main(String[] args) {
        String str = "123";
        int t = 1;
        for(int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) < '0' || str.charAt(i) > '9') && str.charAt(i) != '.') {
                t = 3;
                break;
            }
        }
        for(int i = 0; i < str.length(); i++) {
            if( str.charAt(i) == '.' && t == 1){
                t = 2;
                break;
            }
        }
        
        System.out.println(t);
   }
}
