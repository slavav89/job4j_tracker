package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

public class MemTracker implements Store {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> name = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                name.add(item);
            }
        }
        return name;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            throw new IllegalArgumentException("По указанному id заявки не существует!");
        }
        items.remove(index);
    }

    @Override
    public void close() throws Exception {

    }
}
