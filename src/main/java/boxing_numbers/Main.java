package boxing_numbers;

public class Main {
    public static void main(String[] args) {
        int i = 10;

        /** Autobox to Integer -> select most specific */
        doit(i);
    }
    static void doit(Number i){
        System.out.println("Correct");
    }

    static void doit(Object i){
        System.out.println("Missed");
    }
}
