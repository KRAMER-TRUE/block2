package ru.mirea.block2.practical13.task06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task6 {
    private static int firstLetter(String word) {
        return Character.toLowerCase(word.codePointAt(0));
    }

    private static int lastLetter(String word) {
        return Character.toLowerCase(word.codePointBefore(word.length()));
    }

    private static boolean arrange(String[] words, boolean[] used, int[] order, int position) {
        if (position == words.length) {
            return true;
        }
        for (int i = 0; i < words.length; i++) {
            if (used[i]) {
                continue;
            }
            if (position > 0 && lastLetter(words[order[position - 1]]) != firstLetter(words[i])) {
                continue;
            }
            order[position] = i;
            used[i] = true;
            if (arrange(words, used, order, position + 1)) {
                return true;
            }
            used[i] = false;
        }
        return false;
    }

    public static String getLine(String[] words) {
        for (String word : words) {
            if (word.isEmpty()) {
                return "";
            }
        }
        boolean[] used = new boolean[words.length];
        int[] order = new int[words.length];
        if (!arrange(words, used, order, 0)) {
            return "";
        }

        StringBuilder line = new StringBuilder();
        for (int i = 0; i < order.length; i++) {
            if (i > 0) {
                line.append(' ');
            }
            line.append(words[order[i]]);
        }
        return line.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя текстового файла:");
        String name = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
        if (name.isEmpty()) {
            System.out.println("Имя файла не может быть пустым.");
            return;
        }

        try {
            String text = Files.readString(Path.of(name)).replaceFirst("^\uFEFF", "").strip();
            if (text.isEmpty()) {
                System.out.println("В файле нет слов.");
                return;
            }
            String line = getLine(text.split("\\p{javaWhitespace}+"));
            if (line.isEmpty()) {
                System.out.println("Из этих слов нельзя составить цепочку.");
            } else {
                System.out.println(line);
            }
        } catch (IOException | InvalidPathException e) {
            System.out.println("Не удалось прочитать файл.");
        }
    }
}
