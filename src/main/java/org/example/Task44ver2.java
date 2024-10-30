package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task44ver2 {
    public static void main(String[] args) {
        List<String> arguments = getInputArguments();
        analyzeAndPrintArguments(arguments);
    }

    protected static String determineType(String arg) {
        if (arg.matches("^\\d+$")) {
            return "Integer";
        } else if (arg.matches("^\\d*\\.\\d+$")) {
            return "Real";
        } else if (arg.matches("^'.'$")) {
            return "Character";
        } else if (arg.matches("^\".*\"$")) {
            return "String";
        } else {
            return "Identifier";
        }
    }

    protected static List<String> getInputArguments() {
        Scanner scanner = new Scanner(System.in);
        List<String> arguments = new ArrayList<>();

        System.out.println("Enter arguments. Type 'exit' to finish:");
        while (true) {
            System.out.print("Enter argument: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            arguments.add(input);
        }
        scanner.close();

        return arguments;
    }

    protected static void analyzeAndPrintArguments(List<String> arguments) {
        System.out.println("Total arguments: " + arguments.size());

        for (int i = 0; i < arguments.size(); i++) {
            String arg = arguments.get(i);
            String type = determineType(arg);
            System.out.println("Argument " + (i + 1) + ": type = " + type + ", value = " + arg);
        }
    }

}
