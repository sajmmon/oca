package _interfaces;

class Main {
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

abstract interface I3 {
    default int doit(){return 1;}

}

interface I4 {
    public static final int i=5;

}