package _flow;

public class Main {

    public static void main(String[] args) {

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
    }
}
