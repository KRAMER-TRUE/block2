package ru.mirea.block2.practical8;

import java.util.Scanner;

public class Task14 {
    private static void printDigits(long number) {
        if (number >= 10) {
            printDigits(number / 10);
        }
        System.out.println(number % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        if (!scanner.hasNextLong()) {
            System.out.println("Ошибка: введите целое число в пределах типа long.");
            return;
        }

        long number = scanner.nextLong();
        if (number < 1) {
            System.out.println("Ошибка: число должно быть больше нуля.");
            return;
        }

        printDigits(number);
    }
}
