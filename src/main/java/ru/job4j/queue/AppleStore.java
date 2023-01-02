package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String name = "";
        for (int i = 0; i <= count; i++) {
            name = queue.poll().name();
            if (i == count - 1) {
                break;
            }
        }
        return name;
    }

    public String getLastUpsetCustomer() {
        String name = "";
        for (int i = 0; i <= count; i++) {
            name = queue.poll().name();
            if (i == count) {
                break;
            }
        }
        return name;
    }
}