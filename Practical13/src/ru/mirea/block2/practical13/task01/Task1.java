package ru.mirea.block2.practical13.task01;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void show(String text) {
        if (text.isEmpty()) {
            System.out.println("Строка пустая.");
            return;
        }

        int position = text.indexOf("Java");
        System.out.println("Последний символ: " + text.charAt(text.length() - 1));
        System.out.println("Заканчивается на !!!: " + text.endsWith("!!!"));
        System.out.println("Начинается с I like: " + text.startsWith("I like"));
        System.out.println("Содержит Java: " + text.contains("Java"));
        System.out.println("Индекс Java: " + position);
        System.out.println("После замены: " + text.replace('a', 'o').replace('а', 'о'));
        System.out.println("Верхний регистр: " + text.toUpperCase(Locale.ROOT));
        System.out.println("Нижний регистр: " + text.toLowerCase(Locale.ROOT));
        if (position >= 0) {
            System.out.println("Подстрока: " + text.substring(position, position + 4));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        show(scanner.hasNextLine() ? scanner.nextLine() : "");
    }
}
