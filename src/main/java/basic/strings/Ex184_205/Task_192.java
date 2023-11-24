package basic.strings.Ex184_205;

public class Task_192 {

    public static void main(String[] args) {

        String str = "1ab   Xd  jn4m 45u    Xjk      Xgh   dgdgh gdfh fh Xfhg";
        for (int i = 0; i < str.length(); i++) {
            str = str.replaceAll("  ", " ");
        }
        String str1[] = str.split(" ");
        boolean t = true;
        int count = 0;
        char c = ' ';
        for(int i = 0 ; i < str1.length - 1 ;i++) {

            for (int j = 0; j < i; j++) {
                if (str1[i].charAt(0) == str1[j].charAt(0)) {
                    t = false;
                    break;
                }
            }
            if (t) {
                c = str1[i].charAt(0);
            }

            for (int j = i + 1; j < str1.length; j++) {
                if (c == str1[j].charAt(0)) {

                    count++;
                }
            }
        }
        if(count > 0)
            count++;
        System.out.print(count);
    }
}