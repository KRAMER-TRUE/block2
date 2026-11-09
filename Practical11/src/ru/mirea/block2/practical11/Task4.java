package ru.mirea.block2.practical11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите год, месяц и число через пробел:");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            System.out.println("Введите часы и минуты через пробел:");
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            if (year < 1 || year > 9999) {
                System.out.println("Год должен быть от 1 до 9999.");
                return;
            }

            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.setLenient(false);
            calendar.set(year, month - 1, day, hour, minute);
            Date date = calendar.getTime();

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            System.out.println("Date: " + format.format(date));
            System.out.printf("Calendar: %04d-%02d-%02d %02d:%02d%n", calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
        } catch (NoSuchElementException | IllegalArgumentException e) {
            System.out.println("Некорректные дата или время.");
        }
    }
}
