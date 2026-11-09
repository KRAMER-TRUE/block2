package ru.mirea.block2.practical8;

import java.util.Scanner;

public class Task5 {
    private static int sumDigits(long number) {
        if (number < 10) {
            return (int) number;
        }
        return (int) (number % 10) + sumDigits(number / 10);
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

        System.out.println(sumDigits(number));
    }
}
