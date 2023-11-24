package basic.strings.Ex184_205;

public class Task_203 {

    public static void main(String[] args) {

        String S1 = "123456789";
        String S2="";
        for(int i=S1.length()-2;i>=0;i-=2){
            S2+=S1.charAt(i);
        }
        for(int i=S1.length()-1;i>=0;i-=2){
            S2+=S1.charAt(i);
        }
        System.out.println(S2);
    }
}