package org.example;

public class Task20 {
    public static void main(String[] args) {
        System.out.println("Total arguments: " + args.length);

        for (String arg : args) {
            if (isHexadecimal(arg)) {
                System.out.println("Type: Hexadecimal, Value: " + arg);
            } else {
                System.out.println("Type: String, Value: " + arg);
            }
        }
    }

    private static boolean isHexadecimal(String arg) {
        return arg.matches("0[xX][0-9A-Fa-f]+");
    }
}
