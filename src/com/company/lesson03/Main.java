package com.company.lesson03;

public class Main
{
    public static void main(String[] args)
    {
        String someStr = new String("efvr");
        String someStr1 = new String("efvr");
        Person somePerson = new Person("Mark", "Twen", 44);
        Person emptyPerson = new Person();

        System.out.println("Name: " + somePerson.getName());
        somePerson.setName("Bob");
        System.out.println("Name: " + somePerson.getName());

        somePerson.sayHello();
        somePerson.saySomething("blablabla");


        Dog dog1 = new Dog("Bobby", 5, "?", "white");
        Dog dog2 = new Dog("Tommy", 2, "?", "black", "Mark");
        Dog dog3 = new Dog("Jimmy", 10, "?", "brown");

        Dog[] dogs = {dog1, dog3, dog2};

        for (int i = 0; i < dogs.length; i++)
        {
            if (!dogs[i].hasHome()) {
                dogs[i].setOwner("Mark");
            }
        }

    }
}
