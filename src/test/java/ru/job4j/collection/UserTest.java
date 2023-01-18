package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    public void whenAs() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Andrei", 12));
        users.add(new User("Dmitriy", 15));
        users.add(new User("Roman", 10));
        Iterator<User> it = users.iterator();
        assertThat(it.next()).isEqualTo(new User("Andrei", 12));
        assertThat(it.next()).isEqualTo(new User("Dmitriy", 15));
        assertThat(it.next()).isEqualTo(new User("Roman", 10));
    }

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next()).isEqualTo(new User("Ivan", 31));
        assertThat(it.next()).isEqualTo(new User("Petr", 32));
    }

    @Test
    public void whenAscForUsersWithEqualNameButDifferentAge() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 35));
        users.add(new User("Ivan", 31));
        users.add(new User("Petr", 25));
        users.add(new User("Ivan", 29));
        users.add(new User("Petr", 33));
        users.add(new User("Ivan", 27));
        Set<User> expected = new TreeSet<>(
                Arrays.asList(
                        new User("Ivan", 27),
                        new User("Ivan", 29),
                        new User("Ivan", 31),
                        new User("Petr", 25),
                        new User("Petr", 33),
                        new User("Petr", 35)
                )
        );
        assertThat(users).containsSequence(expected);
    }

    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparePetrVSPetrWithDifferentAge() {
        int rsl = new User("Petr", 31)
                .compareTo(
                        new User("Petr", 32)
                );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparePetrWithDifferentAgeVSPetr() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Petr", 31)
                );
        assertThat(rsl).isGreaterThan(0);
    }
}