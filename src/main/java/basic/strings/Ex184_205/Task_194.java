package basic.strings.Ex184_205;

public class Task_194 {

    public static void main(String[] args) {

        String str = "BUBBLE   SORT       BB B BBBB";
        for (int i = 0; i < str.length(); i++) {
            str = str.replaceAll("  ", " ");
        }
        String bar[] = str.split(" ");
        int count=0;
        int quantity=0;
        str = "";

        for (int i = 0; i <bar.length; i++) {
            count=0;
            for(int j=0;j<bar[i].length();j++){

                if(bar[i].charAt(j)=='B')
                    count++;
            }
            if(count==2)
                quantity++;
            System.out.println(bar[i]+" -> "+count);
        }

        System.out.println(quantity);

    }
}