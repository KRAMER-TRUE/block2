package ru.mirea.block2.practical10;

public final class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private int idNumber;
    private double gpa;

    public Student(String firstName, String lastName, String specialty,
                   int course, String group, int idNumber, double gpa) {
        setFirstName(firstName);
        setLastName(lastName);
        setSpecialty(specialty);
        setCourse(course);
        setGroup(group);
        setIdNumber(idNumber);
        setGpa(gpa);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = required(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = required(lastName);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = required(specialty);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 1) {
            throw new IllegalArgumentException("Курс должен быть больше нуля.");
        }
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = required(group);
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        if (idNumber < 1) {
            throw new IllegalArgumentException("Номер студента должен быть больше нуля.");
        }
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (!Double.isFinite(gpa) || gpa < 0) {
            throw new IllegalArgumentException("Балл должен быть неотрицательным числом.");
        }
        this.gpa = gpa;
    }

    private static String required(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Текстовое поле не должно быть пустым.");
        }
        return value.trim();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + specialty + ", курс " + course
                + ", группа " + group + ", ID " + idNumber + ", балл " + gpa;
    }
}
