package _flow;

public class Main {

    public static void main(String[] args) {

        /** Label must directly preceed loop, error in tests where i++; is used */

        A:
        for(;;){
            int i = 3;
            L:
            for(;;){
                break L;
            }
            break;
        }


        /** switch must by of types:
         * byte, short, char, int or their wrappers
         * or enum
         * or String,
         *
         * values must be constant, literal or final */

        final int x = 1; // MUST BE in one line, real final not eventually final
        final int y = 1;

        switch (y) {
            case x:
                System.out.println("IN");
                break;
            case x + 5:
            case y + 6:
                System.out.println("Ahsa");

        }

        /** assignment is true */
        boolean h = false;
        if(h = true){
            System.out.println("in");
        }

        /** Are equivalent */
        {
            int x1 = 0;
            while (true){
                x1 ++;
                if (x1 > 5) break;
                System.out.println(x1);
            }
        }

        {
            int x1 = 0;
            for(;x1<5;){
                x1 ++;
                if (x1 > 5) break;
                System.out.println(x1);}

        }

        {
            int x1 = 0;
            for(int y1 = 0; y1 < 5; y1++){
                x1 ++;
                if (x1 > 5) break;
                System.out.println(x1);}

        }

        /** Compiles because executed once, so reachable */
        do {
            System.out.println("");
        } while (false);

        /** Does not compile as unreacheable code */
//        while(false){
//            System.out.println("");
//        }

        /** Does not compile, only arrays and Iterable */
//        for(char c : new StringBuilder()){
//
//        }

    }


    /** Labels */
    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL:
            System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }


}
