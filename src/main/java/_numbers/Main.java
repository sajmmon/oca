package _numbers;

public class Main {

    public static void main(String[] args) {

        /** Print float */
        float f = 0.0f;
        System.out.println(f); // 0.0

        /** Autobox to Integer -> select most specific */
        {
            int i = 10;
            doit(i);
        }

        /** reuse variables */
        {
            int i = 10;
            doit(i);
        }
    }

    static void doit(Number i){
        System.out.println("Correct");
    }

    static void doit(Object i){
        System.out.println("Missed");
    }
}
