package ru.mirea.block2.practical14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        if (!scanner.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }

        String line = scanner.nextLine();
        if (line.matches("abcdefghijklmnopqrstuv18340")) {
            System.out.println("Строка совпадает.");
        } else {
            System.out.println("Строка не совпадает.");
        }
    }
}
