package com.company.lesson13;

import java.util.Objects;

public class Person implements Comparable<Person>
{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
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
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public int compareTo(Person o)
    {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString()
    {
        return "Person{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
