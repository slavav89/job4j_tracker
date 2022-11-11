package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void drive() {
    }

    @Override
    public void passenger(int person) {
    }

    @Override
    public int prise(int fuel) {
        return fuel * 50;
    }
}
