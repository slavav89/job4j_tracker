package ru.job4j.pipeline;

public class RemoveDigitsHandler implements Handler<String, String> {

    @Override
    public String process(String input) {
        return input + "slava";
    }
}
