package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanovii@mail.ru", "Ivanov Ivan Ivanovich");
        map.put("sidorov@gmail.ru", "Sidorov Igor Andreevich");
        map.put("smirnov@yandex.ru", "Smirnov Semen Sergeevich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
