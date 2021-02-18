package com.company.lesson04.car;

public class RegularCar extends Car
{
    private Engine engine;
    private double fuelCapacity;

    public RegularCar(String model, String year, String color, Engine engine, double fuelCapacity)
    {
        super(model, year, color);
        this.engine = engine;
        this.fuelCapacity = fuelCapacity;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public double getFuelCapacity()
    {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity)
    {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void start() {
        if (fuelCapacity > 0) {
            super.start();
        } else {
            System.out.println("No more fuel");
        }
    }
}
