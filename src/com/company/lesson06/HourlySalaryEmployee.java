package com.company.lesson06;

public class HourlySalaryEmployee extends Person implements Salary
{
    private int salary;
    private double hours;

    public HourlySalaryEmployee(String name, String surname, int age, int salary, double hours)
    {
        super(name, surname, age);
        this.salary = salary;
        this.hours = hours;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public double getHours()
    {
        return hours;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }

    @Override
    public double calculateSalary()
    {

        return salary * hours;
    }

    @Override
    public void salaryUp(int delta)
    {
        salary += delta;
    }
}
