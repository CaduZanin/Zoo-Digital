package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.app;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int scanInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static String scanString(String message) {
        System.out.print(message);
        scanner.nextLine();
        return scanner.nextLine();
    }
}