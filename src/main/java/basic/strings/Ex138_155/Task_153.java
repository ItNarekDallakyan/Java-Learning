package basic.strings.Ex138_155;

public class Task_153 {

    public static void main(String[] args) {

        String string1 = "ABCDEFGIJKLMNOPQRSTUVWXYZ";
        String string2 = "";
        char[] stringCharArray = string1.toCharArray();

        for (int i = 0; i < stringCharArray.length; i++) {
            char min = stringCharArray[i];
            for (int j = 0; j < stringCharArray.length; j++) {
                if (min > stringCharArray[j]) {
                    stringCharArray[i] = stringCharArray[j];
                    stringCharArray[j] = min;
                    min = stringCharArray[i];
                    System.out.println("min  " + min);
                }
            }
        }
        for (char c : stringCharArray) {
            System.out.print(c + " , ");
        }
    }
}
