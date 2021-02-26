package com.company.lesson08.task;

import java.util.Scanner;

/**
 * sfsdxfnxnc
 *
 */
public class Start
{
    /**
     *
     * @param args
     *
     *
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            //
            System.out.println("Enter your name:");
            String name = scanner.next();

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            if (age < 18)
            {
                throw new UnderAgeException("You are not adult");
            }

            System.out.println("Enter your email:");
            String email = scanner.next();

            if (!email.contains("@"))
            {
                throw new IncorrectEmailException("Email doesn't contain '@'," +
                    " so it's incorrect.");
            }

            Person person = new Person(name, email, age);

            System.out.println("Survey is completed successfully.");
        } catch (UnderAgeException | IncorrectEmailException e) {
            System.out.println(e.getMessage());
            System.out.println("Sorry, you cannot proceed with this survey.");
        } finally
        {
            System.out.println("Thanks for your time.");
        }


        System.out.println("Proceed");

    }
}
