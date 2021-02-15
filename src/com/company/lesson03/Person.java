package com.company.lesson03;

public class Person
{
    String name;
    String surname;
    int age;

    Person() {

    }

    Person (String name1, String surname, int age) {
        name = name1;
        this.surname = surname;
        this.age = age;
    }

    Person (String name1, String surname) {
        name = name1;
        this.surname = surname;
        this.age = 18;
    }

    public String getName() {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    void sayHello() {
        System.out.println(name + " says hello");
    }

    void saySomething(String something) {
        System.out.println(name + " says " + something);
    }

}
