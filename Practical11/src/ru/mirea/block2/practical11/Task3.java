package ru.mirea.block2.practical11;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения студента (дд.мм.гггг):");
        String input = scanner.hasNextLine() ? scanner.nextLine().trim() : "";

        try {
            LocalDate birthDate = LocalDate.parse(input, DateInput.DATE);
            if (birthDate.getYear() < 1 || birthDate.getYear() > 9999) {
                System.out.println("Год должен быть от 1 до 9999.");
                return;
            }
            if (birthDate.isAfter(LocalDate.now())) {
                System.out.println("Дата рождения не может быть в будущем.");
                return;
            }
            Student student = new Student("Иван", "Иванов", "Информатика", 2,
                    "КВБО-11-25", 101, 4.5, birthDate);
            System.out.println(student);
            System.out.println("Короткий формат: " + student.formatBirthDate(FormatStyle.SHORT));
            System.out.println("Средний формат: " + student.formatBirthDate(FormatStyle.MEDIUM));
            System.out.println("Полный формат: " + student.formatBirthDate(FormatStyle.FULL));
        } catch (DateTimeParseException e) {
            System.out.println("Некорректная дата рождения.");
        }
    }
}
