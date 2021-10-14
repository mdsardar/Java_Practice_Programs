package com.company.practice.oca8part2;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Files {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        TreeSet<String> ts = new TreeSet<>();
        String[] k = {"1", "b", "4", "3"};
        String[] v = {"a", "d", "3", "b"};
        for (int i = 0; i < 4; i++) {
            tm.put(k[i], v[i]);
            ts.add(v[i]);
        }
        System.out.println(tm.keySet() + " " + tm.values() + " ");
        Iterator it2 = ts.iterator();
        while (it2.hasNext()) System.out.println(it2.next() + "-");

    }
}
