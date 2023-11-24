package basic.strings.Ex138_155;

public class Task_140 {

    public static void main(String[] args) {

        String string = "020x56000008";

        int indexX = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'x') {
                indexX = i;
                break;
            }
        }
        int count = 0;
        for (int i = indexX + 1; i < string.length(); i++) {
            if (string.charAt(i) == '0')
                count++;
        }
        System.out.println(count);
    }
}