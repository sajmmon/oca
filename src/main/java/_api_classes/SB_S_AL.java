package _api_classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class SB_S_AL {

    /** Types */
    boolean boo;
    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;

    char[] chars;
    String string;
    StringBuilder stringBuilder;
    ArrayList arrayList;

    CharSequence charSequence;
    Collection collection;

    public void main(String[] args) {

        /** ================ Fields */

        /** ONLY String has static fields */
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;

        /** ================ Constructor */

        /** Common */
        string = new String(string);
        stringBuilder = new StringBuilder(string);
        string = new String();
        stringBuilder = new StringBuilder();

        string = new String(stringBuilder);
        stringBuilder = new StringBuilder(charSequence); // StringBuilder is CharSequence

        /** Only String */
        string = new String(chars);

        /** Only StringBuilder */
        stringBuilder = new StringBuilder(5); // otherwise 16

        /** ================ Static Methods */

        /** ONLY String has static methods */
        string = String.copyValueOf(chars);
        string = String.join(charSequence, charSequence);
        string = String.format(string, string );
        string = String.valueOf(i); // primitives or Object
        string = String.valueOf(chars);

        /** ================ Static Methods */

        /** Common */
        c = string.charAt(10);
        c = stringBuilder.charAt(10);
        i = string.codePointAt(10);
        i = stringBuilder.codePointAt(10);
        i = string.codePointBefore(10);
        i = stringBuilder.codePointBefore(10);
        i = string.codePointCount(1,10);
        i = stringBuilder.codePointCount(1,10);

        string.getChars(1,1,chars,1);
        stringBuilder.getChars(1,1,chars,1);

        i = string.indexOf(string);
        i = stringBuilder.indexOf(string);

        i = string.indexOf(string, i);
        i = stringBuilder.indexOf(string, i);

        i = string.lastIndexOf(string);
        i = stringBuilder.lastIndexOf(string);

        i = string.lastIndexOf(string, 1);
        i = stringBuilder.lastIndexOf(string, 1);

        i = string.length();
        i = stringBuilder.length();

        string = string.replace(c,c);
        string = string.replace(charSequence, charSequence);
        string = string.replaceAll(string, string);
        string = string.replaceFirst(string, string);

        stringBuilder.replace(1,1,string);

        string = string.substring(1);
        string = string.substring(1,10);

        charSequence = stringBuilder.subSequence(1,1);
        string = stringBuilder.substring(1);
        string = stringBuilder.substring(1,2);

        /** Only String */
        i = string.compareTo(string);
        i = string.compareToIgnoreCase(string);

        string = string.concat(string);
        boo = string.contains(charSequence);
        boo = string.contentEquals(charSequence);

        boo = string.endsWith(string);
        boo = string.equals(new Object());
        boo = string.equalsIgnoreCase(string);

        boo = string.matches(string);
        boo = string.regionMatches(1, string,1, 1);
        byte[] bytes = string.getBytes(); // variants

        i = string.indexOf(c); // common for String parameter

        boo = string.isEmpty();

        i = string.lastIndexOf(c); // common for String parameter

        String[] str = string.split(string);
        boo = string.startsWith(string);

        chars = string.toCharArray();

        string = string.toLowerCase().toUpperCase().trim();

        /** Only StringBuilder */
        stringBuilder = stringBuilder.append(1); // primitives, CharSequence, chars, Object
        stringBuilder = stringBuilder.appendCodePoint(20);
        i = stringBuilder.capacity();

        stringBuilder.delete(1,10);
        stringBuilder.deleteCharAt(1);

        stringBuilder.ensureCapacity(10);

        stringBuilder.insert(1, chars); // primitive Object

        stringBuilder.reverse();

        stringBuilder.setCharAt(1, c);
        stringBuilder.setLength(1);

        stringBuilder.trimToSize();


        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("a");
        System.out.println(sb1.equals(sb2)); // false

    }
}
