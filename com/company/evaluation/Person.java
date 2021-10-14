package com.company.evaluation;

public class Person implements Comparable<Person> {

    private int person_id;
    private String name;

    @Override
    public int compareTo(Person o) {
        Person p = (Person) o;
        return this.person_id - o.person_id;
    }
}
