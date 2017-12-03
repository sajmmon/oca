package _flow;

public class MainNC {
    public static void main(String[] args) {
        boolean flag = false;

        /** OK conditional compilation */
        if(false)
            flag = !flag;
        System.out.println(flag);

        /** But */
        while(false)
            flag = !flag;
        System.out.println(flag);

        /** no constructor in if without paranthesis */
        if(true) {
            Number n; // or Number n = new Double(3);
        }
    }
}
