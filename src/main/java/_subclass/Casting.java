package _subclass;

public class Casting {

    public static void main(String[] args) {
        /** Can cast to interface */
        C c = (C)new A();

        /** Can not cast to unrelated classes */
        // B b = (B)new A();

    }
}

class A {
    int x;
}
class B extends A{
    void doit(){
        super.x++;
    }
}
interface C{}
