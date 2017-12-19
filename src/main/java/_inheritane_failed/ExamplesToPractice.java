package _inheritane_failed;

public class ExamplesToPractice {

    /**
     * Chapter 7
     * 7, 9, 25, 27, 29, 37
     * static and non-static can not override each other
     */
    public static void main(String[] args) {

    }

    interface I {
        public static final int i = 1;
        public static int doit(){return 1;}
        public default int dothat(){return 1;}
        public abstract int dothis();

    }
}
