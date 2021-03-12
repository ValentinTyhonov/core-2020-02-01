package com.company.lesson13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("str1");
        set.add("str1");
        set.add("sTr1");
        set.add("qjk");
        set.add("aaaa");
        set.add("aaaa");

        for (String elem : set) {
            System.out.println(elem);
        }

        Set<Integer> numbers= new TreeSet<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(1);

        for (Integer elem : numbers) {
            System.out.println(elem + "  " + elem.hashCode());
        }

        Set<Person> people = new TreeSet<>();
        Person p = new Person("Marl", "Ooo", 33);
        people.add(p);
        people.add(new Person("Ken", "Hoh", 16));
        people.add(new Person("Marl", "J", 18));
        people.add(new Person("Danny", "Foo", 16));
        people.add(p);

        for (Person elem : people) {
            System.out.println(elem + "  " + elem.hashCode());
        }
    }
}
