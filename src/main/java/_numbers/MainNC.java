package _numbers;

public class MainNC {
    public static void main(String[] args) {

        /** Casting */
        short s1 = (Short)300; // ILLEGAL
        Short s2 = (Short)300; // ILLEGAL
        short s3 = (short)300; // LEGAL
        short s4 = 300; // LEGAL


        Integer iRef = 0b111_000; //
        byte b = 0B1111_1111;
        double d = 0B111_111D;
        Double dRef = 3___141.592_333_333e-3; //
        int date1 = Integer.parseInt("_2014_01_11"); // Runtime exception
        int date2 = _2001_11;
        long date3 = 2014_11_11_L;
    }


}
