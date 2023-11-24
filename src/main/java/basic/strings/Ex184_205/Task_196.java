package basic.strings.Ex184_205;

public class Task_196 {

    public static void main(String[] args) {

        String str = "aysor   Erevanum spasvum  e  aranc      texumneri exanak      ";
        for(int i=0;i<str.length();i++){
            str=str.replaceAll("  "," ");
        }
        String bar[]=str.split(" ");
        String maxLingthBar=bar[0];
        for(int i=1;i<bar.length;i++){
            if(bar[i].length()>maxLingthBar.length()){
                maxLingthBar=bar[i];
            }
        }
        System.out.println(maxLingthBar);
        System.out.println(maxLingthBar.length());
    }
}