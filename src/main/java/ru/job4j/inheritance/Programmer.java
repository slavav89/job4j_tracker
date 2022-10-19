package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(boolean degree, int experienc, String programLang) {
        super(degree, experienc);
        this.programLang = programLang;
    }
}
