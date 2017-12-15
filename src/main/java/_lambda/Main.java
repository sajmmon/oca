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
        Predicate<Object> predicate = (x) -> 1==1;
        Predicate p1 = predicate.and(predicate);
        Predicate p2 = predicate.negate();
        Predicate p3 = predicate.or(predicate);
        boolean b = predicate.test(new Object());
        Predicate p4 = Predicate.isEqual("sss");
        boolean b1 = p4.test("sss");

    }
}
