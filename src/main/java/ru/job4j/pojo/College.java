package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vyacheslav Vyatkin");
        student.setGroup(123);
        student.setEntrance(new Date());
        System.out.println(student.getName() + " has been studying "
                + student.getGroup() + " since " + student.getEntrance());
    }
}
