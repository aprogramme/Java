import java.util.*;

public class A65_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(10);
        l2.add(15);
        l2.add(20);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(5);
        l1.add(8);
        l1.add(0, 1);  // add at 0 index

        // l1.addAll(0, l2); // add l2 to l1 from index 0
        l1.addAll(l2); // add l2 to l1 at the end;

        // l1.clear();  // clear all elements

        System.out.println(l1.contains(7));   // return true
        System.out.println(l1.contains(30));  // return false

        System.out.println(l1.indexOf(5));

        l1.set(1, 200);
        
        System.out.println(l1.isEmpty());

        l1.addFirst(69);
        l1.addLast(90);

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
