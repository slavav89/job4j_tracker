package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> gName = s -> s.getName().contains(key);
        Predicate<Person> gSurname = s -> s.getSurname().contains(key);
        Predicate<Person> gPhone = s -> s.getPhone().contains(key);
        Predicate<Person> gAddress = s -> s.getAddress().contains(key);
        Predicate<Person> combine = gName.or(gSurname).or(gPhone).or(gAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}