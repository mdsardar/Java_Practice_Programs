package com.company.practice.oca8part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Foggy extends Murky {
    public static void main(String[] args) {
        final List<String> s = new ArrayList<>();
        s.add("a");
        s.add("f");
        s.add("a");
        new Foggy().mutate(s);
        System.out.println(s);
    }

    List<String> mutate(List<String> s) {
        List<String> ms = s;
        ms.add("c");
        return s;
    }
}

class Murky {
    final void mutate(Set s) {
    }
}