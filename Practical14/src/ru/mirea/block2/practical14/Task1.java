package ru.mirea.block2.practical14;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку. Разделители — пробелы, запятые и точки с запятой.");
        if (!scanner.hasNextLine()) {
            System.out.println("Строка не введена.");
            return;
        }

        String[] elements = scanner.nextLine().split("[\\s,;]+");
        int number = 0;
        for (String element : elements) {
            if (!element.isEmpty()) {
                number++;
                System.out.println(number + ". " + element);
            }
        }
        if (number == 0) {
            System.out.println("В строке нет элементов.");
        }
    }
}
