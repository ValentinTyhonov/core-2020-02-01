package com.company.lesson08.task;

public class Person
{
    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age)
    {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return email;
    }

    public void setSurname(String email)
    {
        this.email = email;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
