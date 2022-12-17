package ru.job4j.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        //PrinterInterface printer = new Printer("Привет");
        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет"))));
        printer.print();
    }
}
