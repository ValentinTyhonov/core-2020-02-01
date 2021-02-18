package com.company.lesson04;

public class Person
{
    private String name;
    private String surname;
    private int age;

//    Person() {
//
//    }

    public Person (String name1, String surname, int age) {
        name = name1;
        this.surname = surname;
        this.age = age;
    }

    public Person (String name1, String surname) {
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

    public void sayHello() {
        System.out.println(name + " says hello");
    }
    public String sayHello(String s) {
        System.out.println(name + " says " + s);
        return "";
    }

    public void sayHello(int s) {
        System.out.println(name + " says " + s);
    }


    void sayHelloWorld() {
        System.out.println(name + " says hello");
    }

    protected void saySomething(String something) {
        System.out.println(name + " says " + something);
    }

}
