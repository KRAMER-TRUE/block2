package ru.mirea.block2.practical11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String specialty;
    private final int course;
    private final String group;
    private final int idNumber;
    private final double gpa;
    private final LocalDate birthDate;

    public Student(String firstName, String lastName, String specialty, int course,
                   String group, int idNumber, double gpa, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(FormatStyle style) {
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(style)
                .withLocale(Locale.forLanguageTag("ru-RU"));
        return birthDate.format(format);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", " + specialty + ", курс " + course
                + ", группа " + group + ", ID " + idNumber + ", балл " + gpa
                + ", дата рождения " + formatBirthDate(FormatStyle.MEDIUM);
    }
}
