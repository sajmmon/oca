package _lambda;

import java.util.List;
import java.util.function.Predicate;
import java.lang.Math;

public class MainNC {
    static int i = 0;


    public static void main(String[] args) {
        Predicate<String> p;
        /** Must return true/false not optional*/
//        p = obj -> {
//            if (true) return true;
//        };



        /** Can not shadow variables from method, but can from class and instance */
        //p = args -> true;


        /** Can not also in this way */
        //p = obj -> {String args = null; return true;};





    }
}
