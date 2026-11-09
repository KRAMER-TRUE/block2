package ru.mirea.block2.practical10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeStudents implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getLastName().compareTo(second.getLastName());
    }

    public static void main(String[] args) {
        List<Student> first = new ArrayList<>();
        first.add(new Student("Анна", "Крылова", "Информатика", 2, "КВБО-11-25", 103, 91));
        first.add(new Student("Иван", "Белов", "Информатика", 2, "КВБО-11-25", 101, 84));

        List<Student> second = new ArrayList<>();
        second.add(new Student("Ольга", "Соколова", "Информатика", 2, "КВБО-12-25", 105, 96));
        second.add(new Student("Елена", "Волкова", "Информатика", 2, "КВБО-12-25", 104, 88));

        List<Student> students = new ArrayList<>(first);
        students.addAll(second);
        students.sort(new MergeStudents());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
