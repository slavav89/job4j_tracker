package ru.job4j.map;

import java.util.Map;
import java.util.Set;

public class College {

    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Альтернативный способ решения метода через цикл:
     * for (Student s : students.keySet()) {
     * if (s.account().equals(account)) {
     * return s;
     * }
     * }
     * return null;
     */
    public Student findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(s -> s.account().equals(account))
                .findFirst()
                .orElse(null);
    }

    /**
     * Альтернативный способ решения метода через цикл:
     * Set<Subject> subjects = students.get(a);
     * for (Subject s : subjects) {
     * if (s.name().equals(name)) {
     * return s;
     * }
     * }
     */
    public Subject findBySubjectName(String account, String name) {
        Student a = findByAccount(account);
        if (a != null) {
            return students.get(a)
                    .stream()
                    .filter(s -> s.name().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(new Student("Student", "000001", "201-18-15"),
                Set.of(
                        new Subject("Math", 70),
                        new Subject("English", 85)
                ),
                new Student("Slava", "000002", "202"),
                Set.of(
                        new Subject("Russian", 90),
                        new Subject("History", 80)
                )
        );
        College college = new College(students);
        Student student = college.findByAccount("000002");
        System.out.println("Найденный студент: " + student);
        Subject english = college.findBySubjectName("000002", "Russian");
        System.out.println("Оценка по найденному предмету: " + english.score());
    }
}
