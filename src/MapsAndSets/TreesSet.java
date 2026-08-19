package MapsAndSets;

import java.util.TreeSet;

public class TreesSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(77); set.add(65); set.add(21); set.add(2);
        set.add(11); set.add(45); set.add(3); // set.add(77); Set only contains unique elements
        System.out.println(set.size());
        System.out.println(set);
    }
}
