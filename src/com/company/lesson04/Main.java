package com.company.lesson04;

public class Main
{
    public static void main(String[] args)
    {
        Stud student = new Stud("Mark", "Twen", 44, "CA-11", "NULP");
        Stud student2 = new Stud("Mark", "Twen", 44, "CA-11", "NULP");

        System.out.println(student.equals(student2));
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

//        student.saySomething("Hello");
//        student.study("Math");
//
//        Person person = new Person("Mark", "Twen", 44);
//        person.saySomething("fdfjgfd");
    }
}
