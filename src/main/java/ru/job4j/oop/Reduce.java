package ru.job4j.oop;

public class Reduce {
    private int[] array;

    /**
     * Была ошибка связанная с однинаковыми названиями
     * переменных у поля класса и аргумента метода to()
     */
    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
