package com.company.lesson12;

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
        int result = this.name.compareTo(o.getName());
        if (result == 0) {
            if (this.age > o.getAge()) {
                result = 1;
            } else if (this.age < o.getAge()) {
                result = -1;
            } else {
                result = 0;
            }
        }
        return result;
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
}
