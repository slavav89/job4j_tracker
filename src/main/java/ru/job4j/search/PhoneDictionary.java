package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person people : persons) {
            if (people.getName().contains(key)
                    || people.getSurname().contains(key)
                    || people.getPhone().contains(key)
                    || people.getAddress().contains(key)) {
                result.add(people);
            }
        }
        return result;
    }
}