package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 50);
        Book alchemist = new Book("Alchemist", 100);
        Book girls = new Book("Girls", 150);
        Book cinderella = new Book("cinderella", 200);
        Book temp = new Book();
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = alchemist;
        books[2] = girls;
        books[3] = cinderella;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Название книги " + book.getName()
                    + " c количеством страниц: " + book.getPage());
        }
        String n = System.lineSeparator();
        System.out.println(n + "Новый порядок книг" + n);
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Название книги " + book.getName()
                    + " c количеством страниц: " + book.getPage());
        }
        System.out.println(n + "вывод книги с именем Clean code" + n);
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println("Название книги " + book.getName()
                        + " c количеством страниц: " + book.getPage());
            }
        }
    }
}
