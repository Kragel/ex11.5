package t_11_holdingYourObjects.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args)
    {
        Random rand = new Random(47);
        List<Integer> integers = Integers.arrayList(7);
        System.out.println("1: " + integers);
        Integer h = new Integer(0);

        integers.add(h); // Automatically resizes
        System.out.println("2: " + integers);
        System.out.println("3: " + integers.contains(h));
        integers.remove(h); // Remove by object
        Integer p = integers.get(2);
        System.out.println("4: " + p + " " + integers.indexOf(p));
        Integer cymric = new Integer(3);
        System.out.println("5: " + integers.indexOf(cymric));
        System.out.println("6: " + integers.remove(cymric));
        // Must be the exact object:
        System.out.println("7: " + integers.remove(p));
        System.out.println("8: " + integers);
        integers.add(3, new Integer(4)); // Insert at an index
        System.out.println("9: " + integers);
        List<Integer> sub = integers.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + integers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
        // Order is not important in containsAll():
        System.out.println("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + integers.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(integers); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, new Integer(1)); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + integers.isEmpty());
        integers.clear(); // Remove all elements
        System.out.println("19: " + integers);
        System.out.println("20: " + integers.isEmpty());
        integers.addAll(Integers.arrayList(4));
        System.out.println("21: " + integers);
        Object[] o = integers.toArray();
        System.out.println("22: " + o[3]);
    }
}
