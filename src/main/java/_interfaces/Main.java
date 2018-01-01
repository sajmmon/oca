package _interfaces;

public class Main {
    public static void main(String[] args) {

        /** Uses variable from interface */
        I i = new A();
    }
}

interface I {
    public static final int height = 1;

    default void doit(){
        System.out.println(height);
    }
}

class A implements I{
    int height = 2;
    A(){
        doit();
    }
}

interface I2 {
    void doit() throws Exception;
}