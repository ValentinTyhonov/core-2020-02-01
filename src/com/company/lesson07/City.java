package com.company.lesson07;

public enum City
{
    KYIV(23134, 31212),
    LVIV(23134, 31212),
    PARIS(23134, 31212);

    private double square;
    private long population;

    City(double square, long population)
    {
        this.square = square;
        this.population = population;
    }

    public double getSquare()
    {
        return square;
    }

    public long getPopulation()
    {
        return population;
    }
}
