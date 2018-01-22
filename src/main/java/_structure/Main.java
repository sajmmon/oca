package _structure;


/** Can have duplicate or unused import statements, but can not have unreachable */
import java.lang.Math;
import java.lang.Math;
import java.util.Arrays;
import static _structure.ToImport.*;

import static java.lang.Math.*;

/** At most one public class */
/** public or not */ class Main {

    {i = 3;
    j = 4;

    // Both are imported
    doit();
    doit(1);

    }
    // i = 5;
    int i = 2;

    static {j = 2;}
    static int j = 1;

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
        method(null);
        methodInt(null);

        method(1, null);
        method(null, 1);
        // methodInt(1, null); ILLEGAL

    }

    static void method(Integer... ints){
        System.out.println(Arrays.toString(ints));
    }

    static void methodInt(int... ints){
        System.out.println(Arrays.toString(ints));
    }
}
