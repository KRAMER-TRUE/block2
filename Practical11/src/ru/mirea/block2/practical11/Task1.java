package ru.mirea.block2.practical11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время получения задания (дд.мм.гггг чч:мм):");
        String input = scanner.hasNextLine() ? scanner.nextLine().trim() : "";

        try {
            LocalDateTime received = LocalDateTime.parse(input, DateInput.DATE_TIME);
            if (received.getYear() < 1 || received.getYear() > 9999) {
                System.out.println("Год должен быть от 1 до 9999.");
                return;
            }
            if (received.isAfter(LocalDateTime.now())) {
                System.out.println("Дата получения задания не может быть в будущем.");
                return;
            }
            Date submitted = new Date();
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            System.out.println("Разработчик: Галустов");
            System.out.println("Получение задания: " + received.format(DateInput.DATE_TIME));
            System.out.println("Сдача задания: " + format.format(submitted));
        } catch (DateTimeParseException e) {
            System.out.println("Некорректные дата или время.");
        }
    }
}
