package com.company.lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Start
{
    public static void main(String[] args)
    {
        Map<String, Person> people = new HashMap<>();
        people.put("KV2389322", new Person("Mark", "J", 33));
        people.put("JK1489894", new Person("Tom", "H", 18));
        people.put("IJ9828944", new Person("Mark", "O", 12));
        people.put("IJ9841142", new Person("Sam", "J", 9));
        people.put("KV2389322", new Person("Pol", "Q", 19));

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; V: " + entry.getValue());
        }
        System.out.println();

        Set<String> keys = people.keySet();
        List<Person> values = new ArrayList<>(people.values());

        for (Person person : values) {
            people.put(person.getName(), person);
        }

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "; V: " + entry.getValue());
        }

        Person person = people.get("IJ9828944");
        System.out.println("Found: " + person);
        System.out.println(people.containsKey("Jack")); // false
        System.out.println(people.containsKey("Sam")); // true


        Map<Integer, List<String>> mapWithList = new HashMap<>();
//        Map<Integer, Map<String, List<Map<Person, String>>>>

    }
}
