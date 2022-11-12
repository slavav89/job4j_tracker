package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Умеет летать");
    }

    @Override
    public void passenger(int person) {
        System.out.println("Перевозит количество пассажиров " + person);
    }
}
