package ru.job4j.lambda;

import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        String ayyy = "ayyy";
        ayyy = "aaaa";
        String tmp = ayyy;
        String name = echo(
                () -> {
                    return tmp;
                }
        );
        System.out.println(ayyy);
        System.out.println(name);
    }

    private static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }
}
