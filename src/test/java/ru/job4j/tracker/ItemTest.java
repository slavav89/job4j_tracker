package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {

    @Test
    public void isItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item(15, "Evgeniy"),
                new Item(34, "Roman"),
                new Item(7, "Ivan"),
                new Item(21, "Andrey")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(21, "Andrey"),
                new Item(15, "Evgeniy"),
                new Item(7, "Ivan"),
                new Item(34, "Roman")
        );
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void ItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item(15, "Evgeniy"),
                new Item(34, "Roman"),
                new Item(7, "Ivan"),
                new Item(21, "Andrey")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(34, "Roman"),
                new Item(7, "Ivan"),
                new Item(15, "Evgeniy"),
                new Item(21, "Andrey")
        );
        assertThat(items).isEqualTo(expected);
    }
}
