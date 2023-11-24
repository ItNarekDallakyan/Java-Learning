package basic.strings.Ex184_205;

public class Task_197 {

    public static void main(String[] args) {

        String str = "ashxarh hrashq sirun gandz";
        String []s=str.split(" ");
        for(int i=0;i<s.length;i++){
            String arajinTar=String.valueOf(s[i].charAt(0)).toUpperCase();
            String mnacacTarer=s[i].substring(1,s[i].length());
            s[i]="";
            s[i]+=arajinTar;
            s[i]+=mnacacTarer;
            System.out.print(s[i]+" ");
        }
    }
}