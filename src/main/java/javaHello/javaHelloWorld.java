package javaHello;

import scalaPkg.ScalaClass;

public class javaHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        String aString = "abc";
        Integer anInteger = Integer.getInteger("123");
        new ScalaClass(aString, null);
        new ScalaClass(aString, 0 == 1 ? anInteger: null);
        new ScalaClass(aString, 0 == 1 ? null : anInteger);
        new ScalaClass(aString, 0 == 1 ? new Integer(0) : 0 == 1 ? anInteger : null);
        // The following will throw a NullPointerException, but the previous lines won't
        try {
            new ScalaClass(aString, 0 == 1 ? 0 : 0 == 1 ? anInteger : null);
        } catch (NullPointerException npe) {
            System.out.println("Threw null pointer");
        }
    }
}
