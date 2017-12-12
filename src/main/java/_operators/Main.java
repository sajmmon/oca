package _operators;

import java.io.Serializable;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        int i = 1;

        if (++i == i){
            System.out.println("A: " + i);
        }

        if (i == ++i){
            System.out.println("B: " + i);
        }

        /** Modulo */
        int x = 7 % 3;
        int y = 7 % -3;
        int z = - 7 % 3;
        int w = - 7 % -3;
        int u = (- 7) % -3;
        System.out.println(x + "\t" + y + "\t" + z + "\t" + w + "\t" + u);


        /** Precenence
         * () [] .          LR
         * ++ -- (post)     RL
         * ++ -- (pre) !
         * new (cast)
         * * / %
         * + - + string concatenation
         * << >>
         * < > instanceof
         * != ==
         * &&
         * ||
         * ?:               RL
         * = += -= *= /=    RL
         */

        /** Do not understand why 2 and not 3 */
        int a = 0;
        a = ++a == a++ ? a++ : a++;
        System.out.println(a); //2 !!!

        int x1 = 1;
        System.out.println( x1++ + ++x1 * --x1 ); // 7
        System.out.println("A" + 5 * 6 + "B"); // A30B
        System.out.println(1 + + + + 2); // 3
        System.out.println(1 + + + + 2 - - 3); // 6
        System.out.println(1 + + + + 2 - - - 3); // 0

        boolean b = true;
        boolean b1 = (b = false);

        int i1 = 1;
        int i2 = (i1 = 2);

        System.out.println(b1 +" \t" + i2); // false 2
    }
}
