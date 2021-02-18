package com.company.lesson04.car;

public class Passanger
{
    private String name;
    private String surname;
    private int age;

    public Passanger (String name1, String surname, int age) {
        name = name1;
        this.surname = surname;
        this.age = age;
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

}
