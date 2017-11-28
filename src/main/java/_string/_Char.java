package _string;

public class _Char {

    public static void main(String[] args) {
//        test1();
        test2();
    }
    static void test1() {
        Object o = ('a' + 'b' + 'c');
        System.out.println(o.getClass()); // class java.lang.Integer
    }

    static void test2(){
        String s = "Contentment!";
        int middle = s.length()/2;
        String nt = s.substring(middle -1, middle +1);
        System.out.println(s.lastIndexOf(nt, middle));

        /**
         + operator with strings invokes toString() of another object
         */
        String s1 = 'a' + 'b' + "c";
        System.out.println(s1);

        String s2 = 'a' + "b";
        System.out.println(s2);

        StringBuilder sb = new StringBuilder("a");
        String s3 = "a" + sb;
        System.out.println(s3);

        Object o = new Object();
        String s4 = "a" + o;
        System.out.println(s4);
    }


}
