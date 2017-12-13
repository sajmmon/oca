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

        final int x = 1;
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
