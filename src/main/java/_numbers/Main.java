package _numbers;

public class Main {

    public static void main(String[] args) {

        /** Print float */
        float f = 0.0f;
        System.out.println(f); // 0.0

        /** Autobox to Integer -> select most specific */
        {
            int i = 10;
            doit(i);
        }

        /** reuse variables */
        {
            int i = 10;
            doit(i);
        }

        /** Number interface no booleanValue or charValue*/
        Number n = 10;
        n.byteValue();
        n.doubleValue();
        n.floatValue();
        n.intValue();
        n.longValue();
        n.shortValue();

        /** Math is in lang not util */
        java.lang.Math.random();

        /** Hexa */

        int h = 015;
        if (h == 13L) {
            System.out.println("Hex: " + Integer.toHexString(h));
            System.out.println("Equal");
        }
        else
            System.out.println("Not equal");

        // Prints Equal
    }

    static void doit(Number i){
        System.out.println("Correct");
    }

    static void doit(Object i){
        System.out.println("Missed");
    }
}
