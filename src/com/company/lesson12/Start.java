package com.company.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Start
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {
            System.out.println("Again");
            System.out.println(iterator.next());
        }

        Iterator<Integer> iter = numbers.iterator();

        while (iter.hasNext()) {
            if (iter.next() > 3) {
                iter.remove();
            }
        }

        System.out.println(numbers);


        List<String> list = Arrays.asList("efefw", "sdffwwefewf", "111", "aaaa");
        ListIterator<String> stringListIterator = list.listIterator();

        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.nextIndex() + " : " + stringListIterator.next()); ;
        }

        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previousIndex() + " : " + stringListIterator.previous()); ;
        }



        ////////////////////////////////

        Person person1 = new Person("Mark", "Tven", 33);
        Person person2 = new Person("Marp", "TJF", 19);
        Person person3 = new Person("Mark", "NC", 17);
        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people, new PersonAgeComparator());

        for (Person person : people) {
            System.out.println(person);
        }


    }
}
