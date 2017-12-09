package _string;

public class Main {

    public static void main(String[] args) {

        String s = "abc";
        String s1 = s.substring(0,3);
        String s2 = s.substring(0,3);

        System.out.println(s1 == s2); // true

        s.equals('c'); //  false


        /** OK */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, "a");

        System.out.println(stringBuilder);

        /** But */
        StringBuilder stringBuilder1 = new StringBuilder();
        if(false) stringBuilder1.insert(10, "a"); // StringIndexOutOfBoundsException

        /** replace */
        int start = 0;
        int end = 1;
        stringBuilder.replace(start, end, "Buu");

        /** No matches method, which is in string */
        "".matches("");

        /** insert in StringBuilder */
        StringBuilder sb0 = new StringBuilder("abc");
        sb0.insert(3, "X");
        if(false) sb0.insert(5, "Y"); // StringIndexOutOfBoundsException
        System.out.println(sb0);


        /** Constructor in StringBuilder */
        int intCapacity = 1;
        StringBuilder sb1 = new StringBuilder(intCapacity);
        if(false) {StringBuilder sb2 = new StringBuilder(null);} // NullPointerException
        StringBuilder sb3 = new StringBuilder("a");

        /** CharSequece */
        // StringBuilder sb4 = new StringBuilder(new char[]{'a','b'}); not compile
        CharSequence cs = null;
        if(false) {
            StringBuilder sb4 = new StringBuilder(cs); // NullPointerException
        }


        /** Print null */
        Integer i = null;
        System.out.println(i); // null
        System.out.println("A" + null); // Anull

        /** Just null does not compile */
        // System.out.println(null); // Ambigious method call

    }
}

