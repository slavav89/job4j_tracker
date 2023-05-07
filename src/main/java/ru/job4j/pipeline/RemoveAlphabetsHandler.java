package ru.job4j.pipeline;

public class RemoveAlphabetsHandler implements Handler<String, String> {

    @Override
    public String process(String input) {
        return input.toUpperCase();
    }
}
