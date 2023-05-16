package ru.netology;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> map = new TreeMap<>();
    public int add(String name, String number) {
        map.put(name, number);
        return map.size();
    }

//    findByNumber — найти имя по номеру без полного перебора;

    public String findNumber(String number) {
        return null;
    }


}
