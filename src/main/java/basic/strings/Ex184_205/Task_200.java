package basic.strings.Ex184_205;

import java.util.regex.Pattern;

public class Task_200 {

    public static void main(String[] args) {

        String str = "C:\\Users\\User\\Desktop\\200.txt";
        System.out.println(str);
        String[] katalog = str.split(Pattern.quote("\\"));
        String[] yndlaynum = katalog[katalog.length - 1].split(Pattern.quote("."));
        System.out.println(yndlaynum[0]);
    }
}