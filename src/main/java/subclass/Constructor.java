package subclass;


/**
 * Superclass accesses subclasses methods,
 * but if fields are overwritten than behavior is complex.
 */
public class Constructor {

    public static void main(String[] args) {
        doit(new Extend());
    }

    static void doit(Base b){
        b.add(8);
        b.print();
    }
}

class Base{
    int i;

    /**
     * default constructor of super-class is called
     */
    Base(){
        add(1);
    }
    void add(int v){i+=v;}
    void print(){
        System.out.println(i);
    }
}

class Extend extends Base{

//  See what happens when you uncomment i
//  int i;

    Extend(){
        add(2);
    }
    void add(int v){
        i += v*2;
    }
}
