package ru.mirea.block2.practical13.task05;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: +код страны и 10 цифр или 8 и 10 цифр.");
        String input = scanner.hasNextLine() ? scanner.nextLine() : "";
        try {
            System.out.println(new PhoneNumber(input));
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный номер. Проверьте формат и количество цифр.");
        }
    }
}
