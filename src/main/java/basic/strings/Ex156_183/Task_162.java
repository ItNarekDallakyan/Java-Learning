package basic.strings.Ex156_183;

public class Task_162 {

    public static void main(String[] args) {
        int m = 4;
        int n = 24;
        String string[] = {"Hovsepyan Lianna 295455", //length = n
                            "Tigranyan Lusine 569874",
                            "Stepanyan Narine 295454",
                             "Beglaryan Karine 245698"};

        for(int i = 0; i< m; i++){
            if(string[i].substring(n-7,n-1).equals("295454")) {
                System.out.println(string[i]);
            }
        }
   }
}