package ru.mirea.block2.practical10;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Анна", "Крылова", "Информатика", 2, "КВБО-11-25", 103, 91);
        System.out.println(student);
        student.setCourse(3);
        System.out.println("Новый курс: " + student.getCourse());
    }
}
