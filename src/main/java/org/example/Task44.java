package org.example;

//Аналіз типів аргументів, що задаються під час запуску програми.
// Якщо аргумент є числовим літералом, тобто починається з цифри, то визначається його тип ( "Integer" або "Real"),
// якщо аргумент укладений в поодинокі апострофи і містить один символ, то його тип - "Character",
// якщо аргумент укладений в подвійні апострофи, то його тип - "String ".
// Якщо не одна з умов не виконується, то тип аргументу - "Identifier". Програма виводить кількість заданих
// аргументів і, для кожного аргументу, його тип і значення.

public class Task44 {
    public static void main(String[] args) {
        System.out.println("Total arguments: " + args.length);

        for (String arg : args) {
            if (isInteger(arg)) {
                System.out.println("Type: Integer, Value: " + removeLeadingZeros(arg));
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

    private static String removeLeadingZeros(String arg) {
        return arg.replaceFirst("^0+(?!$)", "");
    }

    private static boolean isInteger(String arg) {
        try {
            Integer.parseInt(removeLeadingZeros(arg));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
