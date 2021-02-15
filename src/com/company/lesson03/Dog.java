package com.company.lesson03;

public class Dog
{
    String name;
    int age;
    String type;
    String color;
    String owner;
    boolean hungry;

    Dog() {

    }

    Dog (String name, int age, String type, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public Dog(String name, int age, String type, String color, String owner)
    {
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
        this.owner = owner;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    boolean hasHome() {
//        return owner != null && !owner.isEmpty();
        if (owner != null && !owner.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


}
