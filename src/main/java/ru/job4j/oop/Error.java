package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status + " error");
        System.out.println("Сообщение: " + message + "\n");
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(false, 0, "Ошибок нет");
        error1.printInfo();
        Error error2 = new Error(true, 1, "error: reached end of file while parsing");
        error2.printInfo();
        Error error3 = new Error(true, 1, "error: illegal start of expression");
        error3.printInfo();
    }
}
