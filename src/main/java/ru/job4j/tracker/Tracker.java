package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) { //Добавление заявок
        item.setId(ids++); //проставляем уникал ключ
        items[size++] = item;
        return item;
    }

    public Item[] findAll() { //Получение списка всех заявок
        Item[] rsl = new Item[size];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                rsl[count] = items[i];
                count++;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) { //получение списка по имени
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                rsl[count] = items[i];
                count++;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        return rsl;
    }

    public Item findById(int id) { //получение заявки по id
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}