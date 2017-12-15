package _lambda;

import java.util.function.Predicate;

public class Main {
    int i;
    static int j;

    public static void main(String[] args) {
        Predicate p;

        /** Can access non-final variables*/
        p = obj -> {
            if (args.length > 0) {

                /** Can shadow instance/class variables, but not local variables */
                int i = 5;
                int j = 6;
                return true;
            } else {
                return false;
            }
        };

        System.out.println(p);

        class A {
            int a;
            public A(int a){
                this.a = a;
            }
        }

        class B extends A{
            int b;
            public B(int a){
                super(a);
                this.b = a;
            }
        }
        /** Predicate */
        Predicate<A> predicateA = (a) -> a.a > 0;
        Predicate<B> predicateB = (b) -> b.b < 5;

        Predicate<B> pAnd = predicateB.and(predicateA);

        boolean result = pAnd.test(new B(3));



        Predicate p4 = Predicate.isEqual("sss");
        boolean b1 = p4.test("sss");

    }
}
