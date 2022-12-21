package ru.job4j.decorator;

public class RightBracketDecorator extends Decorator {

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print("]");
    }
}
