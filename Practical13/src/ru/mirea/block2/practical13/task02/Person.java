package ru.mirea.block2.practical13.task02;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой.");
        }
        this.lastName = lastName.trim();
        this.firstName = firstName == null ? "" : firstName.trim();
        this.patronymic = patronymic == null ? "" : patronymic.trim();
    }

    public String getShortName() {
        StringBuilder name = new StringBuilder(lastName);
        if (!firstName.isEmpty() || !patronymic.isEmpty()) {
            name.append(' ');
        }
        if (!firstName.isEmpty()) {
            name.append(Character.toUpperCase(firstName.charAt(0))).append('.');
        }
        if (!patronymic.isEmpty()) {
            name.append(Character.toUpperCase(patronymic.charAt(0))).append('.');
        }
        return name.toString();
    }
}
