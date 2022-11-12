package ru.job4j.poly;

public class AutoBus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Умеет двигаться по земле");
    }

    @Override
    public void passenger(int person) {
        System.out.println("Перевозит количество пассажиров " + person);
    }
}
