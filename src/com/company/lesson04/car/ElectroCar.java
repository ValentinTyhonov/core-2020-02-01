package com.company.lesson04.car;

public class ElectroCar extends Car
{
    private String batteryModel;
    private double batteryCapacity;

    public ElectroCar(String model,
                      String year,
                      String color,
                      String batteryModel,
                      double batteryCapacity)
    {
        super(model, year, color);
        this.batteryCapacity = batteryCapacity;
        this.batteryModel = batteryModel;
    }

    public String getBatteryModel()
    {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel)
    {
        this.batteryModel = batteryModel;
    }

    public double getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        if (batteryCapacity > 0) {
            System.out.println();
        } else {
            System.out.println("Please charge battery");
        }
    }
}
