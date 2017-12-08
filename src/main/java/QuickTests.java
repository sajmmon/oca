import java.util.ArrayList;

public class QuickTests {

    public static void main(String[] args) {
        boolean h = false;
        if(h = true){
            ++Fish.count;
        }
        System.out.println(Fish.count);


    }
}

class Fish{
    static byte count;
}
