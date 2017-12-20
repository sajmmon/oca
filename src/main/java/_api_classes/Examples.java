package _api_classes;

public class Examples {

    /**
     * Chapter 9: 26, 29, 32, 39, 40, 41, 44, 46, 50
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb = sb.delete(1,2);
        sb = sb.deleteCharAt(1);
        String s = sb.substring(1);
        String s2 = sb.substring(1,1);

        String s3 = s.replace('a', 'b');
        String s4 = s.replace(sb, sb); // CharSequence

    }
}
