package ru.job4j.enums;

public class Order {
    private int id;
    private String model;
    private Status status;

    public Order(int number, String car, Status status) {
        id = number;
        model = car;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", status=" + status +
                '}';
    }
}
