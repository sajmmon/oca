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

        /** Primitive vs Numbers */
        // Long l = new Integer(4); // ILLEGAL
        Long l = new Integer(4).longValue(); // OK
        long l1 = new Integer(4); // OK


        /** Initialization */
        byte b1 = 127;
        // byte b1 = 128; ILLEGAL cast needed
        byte b2 = (byte)128;
        // byte b3 = (Byte)128; ILLEGAL

        short s1 = 32767;
        // short s2 = 32768; ILLEGAL
        short s3 = (short)32768;
        /** Also */
        short s4;
        s4 = 32767;

        char c1 = 32768; // LEGAL because only positive
        char c2 = 0;
        // char c3 = -1; ILLEGAL
        char c4 = 32767 * 2;
        // char c5 = 32768 * 2; ILLEGAL

        int i1 = 32768;
        int i2 = (Integer)32768; // Can cast as literal without dot is int

        long l2 = 100; // Convert int to long
        long l3 = 100L; // With L or l is long
        long l4 = 100l;

        float f1 = 10F;
        float f2 = 10f;

        float f3 =10; // Can convert int to float
        //float f4 = 10.0; // ILLEGAL as literal is double and possible loose of precision

        double d1 = 10;
        double d2 = 10d;
        double d3 = 10D;

        /** Conversion */
        b1 = (byte)d1; // Can cast everything

        d1 = f1;
        d1 = i1;
        d1 = s1;
        d1 = c1;
        d1 = b1;

        // f1 = d1; ILLEGAL
        f1 = i1;
        f1 = s1;
        f1 = c1;
        f1 = b1;

        // i1 = d1; ILLEGAL
        // i1 = f1; ILLEGAL
        i1 = s1;
        i1 = c1;
        i1 = b1;

        // s1 = d1; ILLEGAL
        // s1 = f1; ILLEGAL
        // s1 = i1; ILLEGAL
        // s1 = c1; ILLEGAL
        s1 = b1;

        // c1 = d1;
        // c1 = f1;
        // c1 = i1;
        // c1 = s1; ILLEGAL
        /** char can not be byte as it is only positive */
        // c1 = b1;

        /** Underscores and other notations */

        double d5 = 0.056_666_54_2;



    }

    static void doit(Number i){
        System.out.println("Correct");
    }

    static void doit(Object i){
        System.out.println("Missed");
    }
}
