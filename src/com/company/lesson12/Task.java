package com.company.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(232);
        numbers.add(124);
        numbers.add(12);
        numbers.add(2144);
        numbers.add(214);

        System.out.println(numbers);

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            numbers.set(listIterator.nextIndex(), listIterator.next() * 5 + 1);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

    }
}
















