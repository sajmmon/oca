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
        checkEmpty(ints); // NullPointerException

        /** But */
        checkEmpty(); // Fine
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
