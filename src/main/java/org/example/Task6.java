package org.example;

import java.util.Scanner;

//Створіть програму для визначення коду введеного символу в стандарті Юнікод.
// Забезпечте циклічність виконання програми до введення знака рівності, яке призводить до виходу з програми).

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        while (true) {
            System.out.print("Enter a character (or '=' to exit): ");
            inputChar = scanner.next().charAt(0);

            if (inputChar == '=') {
                System.out.println("Exiting program...");
                break;
            }

            int unicodeValue = (int) inputChar;
            System.out.println("Unicode of character '" + inputChar + "' : " + unicodeValue);
        }
        scanner.close();
    }
}
