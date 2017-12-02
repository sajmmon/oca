package _flow;

public class MainNC {
    public static void main(String[] args) {
        boolean flag = false;

        /** OK */
        if(false)
            flag = !flag;
        System.out.println(flag);

        /** But */
        while(false)
            flag = !flag;
        System.out.println(flag);
    }
}
