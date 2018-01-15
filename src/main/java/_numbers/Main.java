package _numbers;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.misc.FloatingDecimal;

import java.time.format.DateTimeFormatter;

public class Main {

    final public int aaa = 5;
    char char1;
    int int1 = char1;

    {
        System.out.println(char1); // prints emtpy char
        System.out.println(int1); // prints
    }
    final public static void main(String[] args) {

        new Main();
        /** Octal, hexal, binary */

        int octal = 07; // digits 0-7
        int hexalx = 0x1F;
        int hexalX = 0X1A;
        int binaryb = 0b01;
        int binaryB = 0B11;


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


        /** Cast integer to short */
        // Short s1 = (Short)300; // can not cast int to Short
        // short s2 = (Short)300;
        short s3 = (short)300; // OK
        short s4 = 300; // OK

        /** Initialization */
        byte b1 = 127;
        // byte b1 = 128; ILLEGAL cast needed
        byte b2 = (byte)128;
        // byte b3 = (Byte)128; ILLEGAL

        short s1 = 32767;
        // short s2 = 32768; ILLEGAL
        short s5 = (short)32768;
        /** Also */
        short s6;
        s6 = 32767;

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
        int i7 = 012;
        //char c7 = '\u0027';
        int i8 = 0x12;
        int i9 = 0b001;
        int i10 = 0B1;

        /** Confirm */
        Double do1 = new Double(2.0);
        Double do2 = new Double(2.0);
        Double do3 = 2.0;
        Double do4 = 2.0;
        Double do5 = 1.0/0.0;
        do5.isInfinite();

        if(do1 != do2)
            System.out.println("do1 != do2");

        if (do3 != do4)
            System.out.println("do3 != do4");

        if (do1 != do3)
            System.out.println("do1 != do3");

        Long a = new Long(1000);
        Long b = new Long(1000);
        long c = 1000;
        long d = 1000;

        if (a != b)
            System.out.println("a != b");

        if (a == c)
            System.out.println("a == c");

        if (c == d)
            System.out.println("c == d");


        float flo1 = 10L;
        /** Exact return type */
        double d10 = Double.parseDouble("1.0");
        Double d11 = Double.valueOf(1.0);
        Double d12 = Double.valueOf("1.0");

        float f10 = Float.parseFloat("1.0");
        Float f11 = Float.valueOf(1.0f);
        Float f12 = Float.valueOf("1.0");

        long l10 = Long.parseLong("10");
        long l11 = Long.parseLong("10", 2);
        Long l12 = Long.valueOf(10);
        Long l13 = Long.valueOf("10");
        Long l14 = Long.valueOf("10",2);

        int i11 = Integer.parseInt("10");
        int i12 = Integer.parseInt("10",2);
        Integer i13 = Integer.valueOf(10);
        Integer i14 = Integer.valueOf("10");
        Integer i15 = Integer.valueOf("10", 2);

        short s13 = Short.parseShort("10");
        short s14 = Short.parseShort("10",2);
        Short s10 = Short.valueOf((short)10);
        Short s11 = Short.valueOf("10");
        Short s12 = Short.valueOf("10",2);

        byte b13 = Byte.parseByte("10");
        byte b14 = Byte.parseByte("10", 2);
        Byte b10 = Byte.valueOf((byte)10);
        Byte b11 = Byte.valueOf("10");
        Byte b12 = Byte.valueOf("10",2);

        boolean b20 = Boolean.parseBoolean("true");
        Boolean b21 = Boolean.valueOf(true);
        Boolean b22 = Boolean.valueOf("true");

        // char c10 = Character.parse... NOT EXISTS
        char c11 = Character.valueOf('C');

        /** Constructors */

        new Double("10");
        new Float("10");
        new Float(10.0); // argument is double not like in valueOf
        new Long(10);
        new Long("10"); // No constructor with radix
        new Integer("10");
        new Short((short)10); // but here argument is short
        new Short("10");
        new Byte((byte)10);
        new Byte("10");
        new Boolean(true);
        new Boolean("true");
        new Character('c'); // ONLY constructor

        /** Number */
        // Double double0 = new Double(); ILLEGAL
        if(false) {
            Double double1 = new Double(null); // NullPointerException at runtime
        }
        String string = "  +12   ";
        Double double2 = new Double(string);
        // Internally parseDouble is used
        Double double3 = Double.parseDouble(string); // returns double
        Double double4 = Double.valueOf(2.0);
        Double double5 = Double.valueOf(string); // returns Double

        System.out.println(new Double("  +12   "));
        System.out.println(new Double("NaN"));
        System.out.println(new Double("Infinity"));
        System.out.println(new Double("-Infinity"));
        if(false)System.out.println(new Double("-InfinitY"));
        System.out.println(new Double("-Infinity   ")); // trim works

        /** Boolean */
        // Boolean boolean1 = new Boolean(); ILLEGAL
        System.out.println(new Boolean("true"));
        System.out.println(new Boolean(true));
        System.out.println(Boolean.parseBoolean("trUe")); // gives true
        System.out.println(Boolean.parseBoolean("true ")); // gives false trim does not work
        /** This one looks for System property, does not parse anything */
        System.out.println(Boolean.getBoolean("trUE")); // Incorrect String gives false !!!
        /** But there is not Double.getDouble() because it would make no sense */

        System.out.println(new Boolean("true") == new Boolean("true")); // false
        System.out.println(new Boolean("true") == Boolean.TRUE); // false
        System.out.println(Boolean.TRUE == Boolean.TRUE); // true
        System.out.println(new Boolean("true") == true); // true

        /** Character */
        // Character character = new Character(null); ILLEGAL
        Character character1 = new Character('Y');
        Character character2 = new Character((char)20);
        // Character character3 = new Character(20); ILLEGAL
        // Character character4 = new Character("Y"); ILLEGAL

        /** Possible */
        short shorty = new Byte((byte)4);

        /** Whizlab */
        Integer wi = 0;
        Double wd = 0.0;
        if(!wi.equals(wd)) System.out.println("Nope");
    }

    static void doit(Number i){
        System.out.println("Correct");
    }

    static void doit(Object i){
        System.out.println("Missed");
    }
}
