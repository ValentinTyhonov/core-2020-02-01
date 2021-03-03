package com.company.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("^a");
        for (int i = 0; i < 10; i++) {
            String word = scanner.next();
            Matcher matcher = pattern.matcher(word);

            if (matcher.find()) {
                words.add(word);
            }
        }
        System.out.println("In list:");
        for (String word : words) {
            System.out.println(word);
        }


    }


}
