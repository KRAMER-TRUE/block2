package ru.mirea.block2.practical9;

import java.util.Comparator;
import ru.mirea.block2.practical10.Student;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return Double.compare(second.getGpa(), first.getGpa());
    }

    private void quicksort(Student[] students, int left, int right) {
        if (left >= right) {
            return;
        }

        Student pivot = students[left + (right - left) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (compare(students[i], pivot) < 0) {
                i++;
            }
            while (compare(students[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        quicksort(students, left, j);
        quicksort(students, i, right);
    }

    public static void main(String[] args) {
        Student[] students = TestStudent.sampleStudents();
        new SortingStudentsByGPA().quicksort(students, 0, students.length - 1);
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getGpa());
        }
    }
}
