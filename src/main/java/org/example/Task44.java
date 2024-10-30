package org.example;

public class Task44 {
    public static void main(String[] args) {
        System.out.println("Total arguments: " + args.length);

        for (String arg : args) {
            if (isInteger(arg)) {
                System.out.println("Type: Integer, Value: " + arg);
            } else if (isReal(arg)) {
                System.out.println("Type: Real, Value: " + arg);
            } else if (isCharacter(arg)) {
                System.out.println("Type: Character, Value: " + arg);
            } else if (isString(arg)) {
                System.out.println("Type: String, Value: " + arg);
            } else {
                System.out.println("Type: Identifier, Value: " + arg);
            }
        }
    }

    private static boolean isInteger(String arg) {
        return arg.matches("-?\\d+");
    }

    private static boolean isReal(String arg) {
        return arg.matches("-?\\d+\\.\\d+");
    }

    private static boolean isCharacter(String arg) {
        return arg.matches("'[^']'");
    }

    private static boolean isString(String arg) {
        return arg.matches("\"[^\"]*\"");
    }
}
