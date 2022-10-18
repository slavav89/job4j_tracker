package ru.job4j.oop;

public class User {

    /**
     * Это поля объекта, т.к. они объявляются в области класса.
     */
    private String name;
    private int age;

    public boolean canDrive() {
        /**
         * Это локальная переменная т.к. она объявлена в методе.
         */
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
