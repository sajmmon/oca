package _collection;

import java.util.ArrayList;
import java.util.List;

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
    }
}
