package basic.strings.Ex138_155;

public class Task_154 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "cvdecf"; //length = n

        int sum = 0;
        int count = 0;
        for( int i = 0; i < n; i++){
            if(string1.charAt(i) == 'c'){
                sum += i;
                count++;
            }
        }

            System.out.println(sum/count);
    }
}