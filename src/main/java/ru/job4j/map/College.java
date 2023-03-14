package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {

    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> student = Optional.empty();
        for (var stud : students.keySet()) {
            if (stud.account().equals(account)) {
                student = Optional.of(stud);
            }
        }
        return student;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> student = findByAccount(account);
        Optional<Subject> subject = Optional.empty();
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject s : subjects) {
                if (s.name().equals(name)) {
                    subject = Optional.of(s);
                }
            }
        }
        return subject;
    }
}
