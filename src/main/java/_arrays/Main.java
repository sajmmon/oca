package _arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /** Sort and toString */
        Number[] n = new Integer[]{1,7,4};
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.binarySearch(n, 5));

        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.binarySearch(n, 5));

        /** Casting */
        A[] as1 = new B[1];
        B[] bs1 = (B[])as1;

        /** But */
        A[] as = new A[1];
        if(false) {
            B[] bs = (B[]) as; // ClassCastException: [L_arrays.A; cannot be cast to [L_arrays.B;
        }

        /** Iterate */
        int[] ints = null;
        if(false)
            checkEmpty(ints); // NullPointerException

        /** But */
        checkEmpty(); // Fine

        /** Null */
        int[] ints1 = {1,4,3,4};
        Integer[] integers = {1,3,4,3,null};

        // Arrays.binarySearch(ints1, null); not compile
        if(false)
            Arrays.binarySearch(integers, null); // NullPointerException

        /** prints null */
        Integer[] ints2 = new Integer[]{null};
        System.out.println(ints2[0]); // prints null


        /** Assignments */

        char[] charArray = null;
        int[] intArray = null;

        Number[] numberArray = null;
        Double[] doubleArray = null;

        // intArray = charArray; incompatible types
        numberArray = doubleArray; // OK
    }

    static void checkEmpty(int... args){
        for(int i : args);
    }
}

class A {
    int i = 1;
    A(){
        i = 2;
    }
}
class B extends A{
    B(){
        i = 3;
    }
}
