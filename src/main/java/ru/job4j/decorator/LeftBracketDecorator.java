package ru.job4j.decorator;

public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}
