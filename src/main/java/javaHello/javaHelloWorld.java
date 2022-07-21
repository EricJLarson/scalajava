package javaHello;

import scalaPkg.ScalaClass;

public class javaHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        String aString = "abc";
        Integer anInteger = new Integer(123);
        new ScalaClass(null);
        new ScalaClass(0 == 1 ? anInteger: null);
        new ScalaClass(0 == 1 ? null : anInteger);
        new ScalaClass(0 == 1 ? new Integer(66) : 0 == 1 ? anInteger : null);
        // The following will throw a NullPointerException, but the previous lines won't
        try {
            new ScalaClass(0 == 1 ? 66 : 0 == 1 ? anInteger : null);
        } catch (NullPointerException npe) {
            System.out.println("Threw null pointer");
        }
    }
}
