package ru.job4j.poly;

public class TransportVehicle {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle plane = new Airplane();
        Vehicle train = new Train();
        Vehicle trains = new Train();
        Vehicle autoBus = new AutoBus();
        Vehicle bus = new AutoBus();
        Vehicle[] vehicles = new Vehicle[]{airplane, plane, train, trains, autoBus, bus};
        int n = 5;
        for (Vehicle v : vehicles) {
            v.move();
            v.passenger(20 + n);
            n = n + 5;
        }
    }
}
