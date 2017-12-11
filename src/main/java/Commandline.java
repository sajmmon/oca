public class Commandline {

    /**
     * java CommandLine "a" 'b' \"c\" "d' 'e" \\f\\
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]);

        /** Prints
         a
         'b'
         "a"
         c' 'd
         \\e\\

         * */

    }
}
