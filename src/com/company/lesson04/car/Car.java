package com.company.lesson04.car;

public abstract class Car
{
    private String model;
    private String year;
    private String color;
    private Passanger[] passangers;

    public Car(String model, String year, String color)
    {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Passanger[] getPassangers()
    {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers)
    {
        this.passangers = passangers;
    }

    public abstract void start();

    public void stop() {
        System.out.println("Car is stopping");
    }
}
