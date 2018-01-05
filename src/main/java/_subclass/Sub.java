package _subclass;

class Sup {
    String s = "";
    Sup() {
        s += "sup ";
    }
}

class Sub extends Sup {
    Sub() {
        s += "sub ";
    }
}

class SubSub extends Sup {
    interface I {

    }
    I i = new I(){};

    SubSub() {
        s += "subsub ";
    }

    public static void main(String args [ ] ) {
        System.out.print(new SubSub().s);
    }
}