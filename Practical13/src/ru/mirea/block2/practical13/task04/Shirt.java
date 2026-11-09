package ru.mirea.block2.practical13.task04;

public class Shirt {
    private final String id;
    private final String name;
    private final String color;
    private final String size;

    public Shirt(String row) {
        String[] parts = row.split(",", -1);
        if (parts.length != 4) {
            throw new IllegalArgumentException("У рубашки должно быть четыре поля.");
        }
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
            if (parts[i].isEmpty()) {
                throw new IllegalArgumentException("Поля рубашки не могут быть пустыми.");
            }
        }
        id = parts[0];
        name = parts[1];
        color = parts[2];
        size = parts[3];
    }

    @Override
    public String toString() {
        return "Код: " + id + "\nНазвание: " + name + "\nЦвет: " + color + "\nРазмер: " + size;
    }
}
