package _collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        /** Constructor creates new collection */
        List list1 = new ArrayList();
        list1.add(sb);
        List list2 = new ArrayList(list1);
        list1.add (null);

        System.out.println(list2); // Only [null]

        /** But the object is shared */
        sb.append(1);

        System.out.println(list1 + "\n" + list2);

        /** Behavior of null */
        System.out.println(list1.contains(null));
        if (false) {
            Collections.binarySearch(list1, null); //  ClassCastException, StringBuilder is not Comparable
            Collections.sort(list1); // Throws NullPointerException
        }
        Collection<String> c = new ArrayList<>();
        String[] array = new String[]{"A", "B", null};

        c.addAll(Arrays.asList(array));

        System.out.println(c.contains(null)); // true
        // Collections.binarySearch(c, "A"); ILLEGAL

        List<String> l = (List<String>)c;
        if(false) {
            int i = Collections.binarySearch(l, null); // NullPointerException
        }

    }
}
