package _structure;

class MainNC {

    /** Allowed */
    private MainNC(){}
//    public MainNC(){}
//    protected MainNC(){}

    /** Now it is not constructor but method */
    //void MainNC(){}

    /** final, static, default not allowed, only access modifiers */
//    final MainNC(){}
//    static MainNC(){}
//    default MainNC(){}

    /** Two local variables fail to compile */
    void method() {
        int name = 1;
        if (5 > 10) {
            //int name = 2;
        }
    }

}


