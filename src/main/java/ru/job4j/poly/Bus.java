package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passenger(int person) {
        System.out.println("Количество пассажиров в автобусе: " + person);
    }

    @Override
    public int prise(int fuel) {
        return fuel * 50;
    }
}
