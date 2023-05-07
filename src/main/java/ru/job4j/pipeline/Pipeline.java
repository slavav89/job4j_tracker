package ru.job4j.pipeline;

public class Pipeline<I, O> {
    private final Handler<I, O> currentHandler;

    public Pipeline(Handler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    public <K> Pipeline<I, K> addHandler(Handler<O, K> newHandler) {
        return new Pipeline<>(i -> newHandler.process(currentHandler.process(i)));
    }

    public O execute(I input) {
        return currentHandler.process(input);
    }

    public static void main(String[] args) {
        var filter = new Pipeline<>(new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitsHandler())
                .addHandler(new ConvertToCharArrayHandler());
        System.out.println(filter.execute("GoYandex123!"));
    }
}
