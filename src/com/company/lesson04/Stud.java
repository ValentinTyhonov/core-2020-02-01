package com.company.lesson04;

public class Stud extends Person
{
    private final static String TYPE_FFF = "ddd";
    private String group;
    private String university;

    Stud (String name, String surname, int age, String group, String university) {
        super(name, surname, age);
        this.group = group;
        this.university = university;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public String getUniversity()
    {
        return university;
    }

    public void setUniversity(String university)
    {
        this.university = university;
    }

    public void study(String subject) {
        System.out.println("I'm studying " + subject);
        saySomething("dsfhhjs");

    }

    @Override
    public void sayHello() {
        super.sayHello();

        System.out.println(university);
    }


}
