package basic.strings.Ex156_183;

public class Task_159 {

    public static void main(String[] args) {
        int n = 10;
        String string1 = "0123456789"; //length = n
        String string2 = "";


        for(int i = 1; i < n ; i++){
            if(i % 3 != 0){
                string2 += string1.charAt(i);
            }

        }
        System.out.println(string2);
   }
}