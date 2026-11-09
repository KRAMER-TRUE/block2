package ru.mirea.block2.practical13.task02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String lastName = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
        if (lastName.isEmpty()) {
            System.out.println("Фамилия не может быть пустой.");
            return;
        }

        System.out.println("Введите имя (можно оставить пустым):");
        String firstName = scanner.hasNextLine() ? scanner.nextLine() : "";
        System.out.println("Введите отчество (можно оставить пустым):");
        String patronymic = scanner.hasNextLine() ? scanner.nextLine() : "";
        Person person = new Person(lastName, firstName, patronymic);
        System.out.println(person.getShortName());
    }
}
