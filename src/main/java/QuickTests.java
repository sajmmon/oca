import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class QuickTests {

    public static void main(String[] args) {

        {
            String s = ":";
            String[] strings = s.split(":");
            System.out.println(Arrays.toString(strings));
            // []
        }

        {
            String s = "a:";
            String[] strings = s.split(":");
            System.out.println(Arrays.toString(strings));
            // [a]
        }

        {
            String s = ":a";
            String[] strings = s.split(":");
            System.out.println(Arrays.toString(strings));
            // [,a]
        }



    }
}

class Fish{
    static byte count;
}
