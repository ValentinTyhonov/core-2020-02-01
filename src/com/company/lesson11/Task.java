package com.company.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (!strings.contains("break")) {
            strings.add(scanner.next());
        }

        printAll(strings);
        printAllStartWithS(strings);

    }

    private static void printAll(List<String> list) {
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void printAllStartWithS(List<String> list) {
        for (String str : list) {
            if (str.startsWith("s")) {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }


 }
