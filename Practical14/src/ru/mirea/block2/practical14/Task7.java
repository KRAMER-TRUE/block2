package ru.mirea.block2.practical14;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        if (!scanner.hasNextLine()) {
            System.out.println("Пароль не введён.");
            return;
        }

        String password = scanner.nextLine();
        boolean valid = password.matches("[A-Za-z0-9_]{8,}")
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[0-9].*");
        if (valid) {
            System.out.println("Пароль надёжный.");
        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }
}
