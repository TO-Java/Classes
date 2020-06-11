package L20200610;

import java.util.Scanner;

public class Types {

    public static void main(String[] args) {

        // Types in Java

        // Primitive Types

        // Integers
        byte byteVar = 10; // Integer of 1 byte long
        byteVar = Byte.MAX_VALUE;

        short shortVar = 10; // Integer of 2 bytes long
        shortVar = Short.MIN_VALUE;
        byteVar = (byte) shortVar;
        shortVar = byteVar;

        // Default
        int intVar = 10; // Integer of 4 bytes long
        intVar = Integer.MAX_VALUE;
        shortVar = (short) intVar;
        intVar = shortVar;

        long longVar = 10L; // Integer of 8 bytes long
        longVar = Long.MAX_VALUE;
        intVar = (int) longVar;
        longVar = intVar;

        // Reals
        float floatVar = 1.54F; // Real number of 4 bytes long
        floatVar = Float.MAX_VALUE;
        longVar = (long) floatVar;
        floatVar = longVar;

        // Default
        double doubleVar = 1.54; // Real number of 8 bytes long
        doubleVar = Double.MAX_VALUE;
        floatVar = (float) doubleVar;
        doubleVar = floatVar;

        // Boolean
        boolean boolVar = true; // Boolean (unspecified)

        // Characters
        char charVar = 'a'; // Character of 2 bytes long
        charVar = 10;
        charVar = (char) byteVar;
        charVar = (char) doubleVar;
        byteVar = (byte) charVar;
        shortVar = (short) charVar;
        intVar = charVar;
        charVar = Character.MAX_VALUE;

        // Expressions
        System.out.println('d' + 0);

        // Non-Primitive Types

        // Objects
        String str = "Good day";
        Scanner in = new Scanner(System.in);
    }
}
