package _arrays;

public class MainNC {
    public static void main(String[] args) {

        // Integer[] integers = new int[3]; //ILLEGAL
        // int[] ints = new Integer[4]; //ILLEGAL
        Number[] numbers = new Integer[3]; // OK

    }

    static void init(){
        int[] i;
        // i = {1,2,3}; // ILLEGAL
        i = new int[3];

        int[][][] i3 = new int[1][][];
        // int[][][] i4 = new int[1][][3]; // ILLEGAL

    }

    static void declarations(){
        int[] a1 = new int[0];
        int[] a2 = {};
        int[] a3 = new int[]{};
        // int[] a4 = new int[4] {}; // ILLEGAL
        // int[] a5 = new int[4] {0,1,2,3}; //
        int[] a6 = new int[] {0,1,2,3};
        int[] a7[] = new int[4][];
        int[][] a8 = new int[4][];
        // int[][] a9 = new int[][4];
        int[][] a10 = new int[4][0];
    }
}
