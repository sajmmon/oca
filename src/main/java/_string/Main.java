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
        stringBuilder1.insert(10, "a"); // StringIndexOutOfBoundsException

        /** replace */
        int start = 0;
        int end = 1;
        stringBuilder.replace(start, end, "Buu");

        /** No matches method, which is in string */
        "".matches("");


    }
}

