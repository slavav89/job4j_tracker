package ru.job4j.enums;

import org.w3c.dom.ls.LSOutput;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        Status lada = Status.ACCEPTED;
        Status bmw = Status.IN_WORK;
//        System.out.println(toyota);
//        System.out.println(volvo);
//        System.out.println(lada);
//        System.out.println(bmw);

        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getId() + " на автомобиль " + order.getModel()
                + ", статус ремонта: " + order.getStatus().getInfo() + ", подробности: " + order.getStatus().getMessage());

        //System.out.println(order);
        Status[] statuses = Status.values();
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
    }
}
