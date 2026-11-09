package ru.mirea.block2.practical9;

import ru.mirea.block2.practical10.Student;

public class TestStudent {
    static Student[] sampleStudents() {
        return new Student[] {
            new Student("Анна", "Крылова", "Информатика", 2, "КВБО-11-25", 103, 91),
            new Student("Иван", "Белов", "Информатика", 2, "КВБО-11-25", 101, 84),
            new Student("Ольга", "Соколова", "Информатика", 2, "КВБО-11-25", 102, 96)
        };
    }

    private static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student student = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber() > student.getIdNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = student;
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber = sampleStudents();
        insertionSort(iDNumber);
        for (Student student : iDNumber) {
            System.out.println(student.getIdNumber() + " " + student.getLastName());
        }
    }
}
