package _operators;

public class Main {
    public static void main(String[] args) {
        int i = 1;

        if (++i == i){
            System.out.println(i);
        }

        /** Modulo */
        int x = 7 % 3;
        int y = 7 % -3;
        int z = - 7 % 3;
        int w = - 7 % -3;
        int u = (- 7) % -3;
        System.out.println(x + "\t" + y + "\t" + z + "\t" + w + "\t" + u);
    }
}
