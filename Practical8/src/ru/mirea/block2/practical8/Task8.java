package ru.mirea.block2.practical8;

import java.util.Scanner;

public class Task8 {
    private static boolean isPalindrome(String word, int left, int right) {
        if (left >= right) {
            return true;
        }
        return word.charAt(left) == word.charAt(right)
                && isPalindrome(word, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово строчными латинскими буквами:");
        String word = scanner.hasNextLine() ? scanner.nextLine().trim() : "";
        if (!word.matches("[a-z]+")) {
            System.out.println("Ошибка: нужно непустое слово из строчных латинских букв.");
            return;
        }

        System.out.println(isPalindrome(word, 0, word.length() - 1) ? "YES" : "NO");
    }
}
