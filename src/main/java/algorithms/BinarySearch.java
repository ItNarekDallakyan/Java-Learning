package algorithms;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    private static int[] data = new int[10]; // create space for array

    public static void main(String[] args){
        Random generator = new Random();

        for (int i = 0; i < 10; i++)
            data[i] = 10 + generator.nextInt(90);

        Arrays.sort(data);

        System.out.println(binarySearch(3));
    }

    public static int binarySearch(int searchElement){
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;

        do {
            System.out.print(remainingElements(low, high));

            for (int i = 0; i < middle; i++)
                System.out.print("   ");
            System.out.println(" * ");

            if (searchElement == data[middle])
                location = middle;
            else if (searchElement < data[middle])
                high = middle - 1;
            else
                low = middle + 1;

            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));

        return location;
    }

    public static String remainingElements(int low, int high){
        StringBuffer temporary = new StringBuffer();

        for (int i = 0; i < low; i++)
            temporary.append("   ");

        for (int i = low; i <= high; i++)
            temporary.append(data[i] + " ");

        temporary.append("\n");
        return temporary.toString();
    }
}

