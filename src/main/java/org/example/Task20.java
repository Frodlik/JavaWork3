package org.example;

// Аналіз типів аргументів, що задаються під час запуску програми.
// Якщо аргумент є цілим шістнадцятковим числом
// (шаблон: складається з цифр від 0 до 9 і букв A (a), B (b), C (c), D (d), E (e), F (f), перед числом повинні стояти
// символи "0X" або "0x"), то тип аргументу "Hexadecimal", інакше "String".
// Програма виводить кількість заданих аргументів і для кожного аргументу його тип і значення.

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
