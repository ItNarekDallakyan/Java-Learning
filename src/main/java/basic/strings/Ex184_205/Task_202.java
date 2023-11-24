package basic.strings.Ex184_205;

import java.util.regex.Pattern;

public class Task_202 {

    public static void main(String[] args) {

        String str = "C:\\Users";
        System.out.println(str);
        String []katalog=str.split(Pattern.quote("\\"));

        if(katalog.length==2){
            System.out.println("\\");
        }else{
            System.out.println(katalog[0]);
        }
    }
}