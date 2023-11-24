package collections.set.training.pkg7;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("arajin");
        hs.add("erkrord");
        hs.add("errord");
        System.out.println("hashseti parunakutyun@");
        System.out.println(hs);

        String[] toxizangvac = new String[hs.size()];
        hs.toArray(toxizangvac);

        for (String elements : toxizangvac) {
            System.out.println(elements);
        }
        System.out.println(hs.size());

        List<String> strings = Arrays.asList("C", "Z", "A");

        System.out.println(strings);

        Collections.sort(strings);

        System.out.println(strings);

        Collections.sort(strings, Collections.reverseOrder());
        System.out.println(strings);


        String x[] = {"A", "C", "E"};
        int y = Arrays.binarySearch(x, "Pasf");
        System.out.println(y);

    }
}
