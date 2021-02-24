package com.company.lesson07;

import java.util.Scanner;

public class Console
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. sd");
            System.out.println("2. dd");
            System.out.println("3. fd");
            System.out.println("Make you choice: ");
            choice = scanner.next();

            switch (Integer.parseInt(choice)) {
                case 1: {
                    System.out.println("Hello");
                    break;
                }
                case 2: {
                    System.out.println("World");
                    break;
                }
                default: {
                    return;
                }
            }
        } while (true);


    }
}
