package _structure;

import java.lang.Math;
import static java.lang.Math.*;

/** public or default */ class Main {

    protected Main(){}
    Main(int a){}
    private Main(byte a){}
    public Main(char a){}
    // abstract Main(long a){} ILLEGAL

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(PI);

        /** Multiline comments */

        String s1 = /* jj */ "s";
        String s2 = "a" +/* jj */ "s";
        String s3 = // Comment
                "b";
    }
}
