package collections.set.treeset.book_tasks;

import java.util.TreeSet;

public class Task_2 {
    public static void main(String[] args){
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        // Print the tree list
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}
