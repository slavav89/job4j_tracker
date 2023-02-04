package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] array1 = o1.split("/");
        String[] array2 = o2.split("/");
        int rsl = array2[0].compareTo(array1[0]);
        if (rsl == 0 && Math.min(array1.length, array2.length) == 1) {
            rsl = Integer.compare(array1.length, array2.length);
        }
        if (rsl == 0) {
            for (int i = 1; i < Math.min(array1.length, array2.length); i++) {
                rsl = array1[i].compareTo(array2[i]);
                if (rsl != 0) {
                    break;
                }
            }
        }
        return rsl;
    }
}
