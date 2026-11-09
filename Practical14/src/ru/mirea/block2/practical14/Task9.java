package ru.mirea.block2.practical14;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для подсчёта английских букв:");
        if (!scanner.hasNextLine()) {
            System.out.println("Текст не введён.");
            return;
        }

        String text = scanner.nextLine();
        int[] counts = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter - 'A' + 'a');
            }
            if (letter >= 'a' && letter <= 'z') {
                counts[letter - 'a']++;
            }
        }

        boolean found = false;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) ('a' + i) + " — " + counts[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("В тексте нет английских букв.");
        }
    }
}
