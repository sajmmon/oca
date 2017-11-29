package _lambda;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate p;

        /** Can access non-final variables*/
        p = obj -> {
            if (args.length > 0) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(p);

    }
}
