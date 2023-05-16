package ru.netology;

import java.util.*;

public class PhoneBook {
    private Map<String, String> map = new TreeMap<>();

    public int add(String name, String number) {
        map.put(name, number);
        return map.size();
    }

    public Object findNumber(String number) {
        Object[] keySet = map.keySet().toArray();
        List<String> values = new ArrayList<>(map.values());
        if (values.contains(number)) {
            return keySet[values.indexOf(number)];
        }
        return null;
    }

    public String findByName(String name) {
        return map.get(name);
    }

    public String printAllNames() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("\n");
        }
        System.out.println(sb.toString());
        return sb.toString();

    }


}
