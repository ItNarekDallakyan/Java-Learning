package collections.set.training.pkg5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by User on 03.11.2018.
 */
public class IteratorRemove {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element%2==0){
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}
