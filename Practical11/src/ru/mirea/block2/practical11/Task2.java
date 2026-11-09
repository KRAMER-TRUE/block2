package ru.mirea.block2.practical11;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время для сравнения (дд.мм.гггг чч:мм):");
        String input = scanner.hasNextLine() ? scanner.nextLine().trim() : "";

        try {
            LocalDateTime entered = LocalDateTime.parse(input, DateInput.DATE_TIME);
            if (entered.getYear() < 1 || entered.getYear() > 9999) {
                System.out.println("Год должен быть от 1 до 9999.");
                return;
            }
            LocalDateTime now = LocalDateTime.now().withSecond(0).withNano(0);
            System.out.println("Текущее время: " + now.format(DateInput.DATE_TIME));
            if (entered.isBefore(now)) {
                System.out.println("Введённое время раньше текущего.");
            } else if (entered.isAfter(now)) {
                System.out.println("Введённое время позже текущего.");
            } else {
                System.out.println("Дата и время совпадают.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Некорректные дата или время.");
        }
    }
}
