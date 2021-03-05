package com.company.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start
{
    public static void main(String[] args)
    {
        Integer[] numbers = { 2323, 24, 12, 14, 142124, 124,21 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [12, 14, 21, 24, 124, 2323, 142124]

        List<Integer> nums = Arrays.asList(numbers);
        List<String> words = new ArrayList<>();
        List<String> newWords = Arrays.asList("weweq", "two", "three");
        List<String> newWordsCopy = new ArrayList<>(newWords);


        if (words.isEmpty()) {
            for (String str : newWords) {
                words.add(str);
            }
            for (int i = 0; i < newWords.size(); i++) {
                words.add(newWords.get(i));
            }
            words.addAll(newWords);
        }

        words.remove("two");
        words.set(0, "hello");


        for (String str : words) {
            System.out.println(str);
        }

        System.out.println(words.contains("two"));

    }


}
