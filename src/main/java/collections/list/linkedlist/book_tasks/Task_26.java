package collections.list.linkedlist.book_tasks;

import java.util.LinkedList;

public class Task_26 {
    public static void main(String[] args){
        LinkedList<String> c1= new LinkedList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        // Replacing 2nd element with new value
        c1.set(1, "Orange");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + c1);
    }
}
