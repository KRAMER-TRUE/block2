package ru.mirea.block2.practical11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    private static final int SIZE = 20_000;
    private static final int REPEATS = 2_000;

    private static void compare(List<Integer> list) {
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        long start = System.nanoTime();
        for (int i = 0; i < REPEATS; i++) {
            list.add(0, -1);
        }
        long insert = (System.nanoTime() - start) / 1_000;

        start = System.nanoTime();
        for (int i = 0; i < REPEATS; i++) {
            list.remove(0);
        }
        long remove = (System.nanoTime() - start) / 1_000;

        start = System.nanoTime();
        for (int i = 0; i < REPEATS; i++) {
            list.add(-1);
        }
        long append = (System.nanoTime() - start) / 1_000;

        int found = 0;
        Integer target = SIZE - 1;
        start = System.nanoTime();
        for (int i = 0; i < REPEATS; i++) {
            if (list.contains(target)) {
                found++;
            }
        }
        long search = (System.nanoTime() - start) / 1_000;

        System.out.println("Вставка в начало: " + insert + " мкс");
        System.out.println("Удаление из начала: " + remove + " мкс");
        System.out.println("Добавление в конец: " + append + " мкс");
        System.out.println("Поиск по значению: " + search + " мкс, найдено " + found + " раз");
    }

    public static void main(String[] args) {
        System.out.println("Начальный размер: " + SIZE + ", повторов операции: " + REPEATS);
        System.out.println("ArrayList");
        compare(new ArrayList<>());
        System.out.println("LinkedList");
        compare(new LinkedList<>());
    }
}
