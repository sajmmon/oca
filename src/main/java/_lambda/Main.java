package _lambda;

import java.util.function.Predicate;

public class Main {
    int i;
    static int j;

    public static void main(String[] args) {
        Predicate p;

        /** Can access non-final variables*/
        p = obj -> {
            if (args.length > 0) {

                /** Can shadow instance/class variables, but not local variables */
                int i = 5;
                int j = 6;
                return true;
            } else {
                return false;
            }
        };

        System.out.println(p);

        /** Predicate */
        Predicate predicate = null;
        predicate.and(predicate);
        predicate.negate();
        predicate.or(predicate);
        predicate.test(new Object());
        Predicate.isEqual(new Object());

    }
}
