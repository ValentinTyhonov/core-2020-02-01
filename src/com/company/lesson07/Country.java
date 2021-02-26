package com.company.lesson07;

import java.io.IOException;

public enum Country
{
    UKRAINE("Ukraine", "UAH", 48838483, City.KYIV),
    USA("United States of America", "USD", 3245123, City.LVIV),
    FRANCE("France", "", 6534623, City.PARIS);

    private String name;
    private String currency;
    private long population;
    private City capital;

    Country(String name, String currency, long population, City capital)
    {
        this.name = name;
        this.currency = currency;
        this.population = population;
        this.capital = capital;
    }

    public String getName()
    {
        return name;
    }

    public String getCurrency()
    {
        return currency;
    }

    public long getPopulation()
    {
        return population;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public boolean isUsd() throws IOException
    {

        if (currency.isEmpty()) {
            throw new IOException("fd");
        }

        return this.getCurrency().equals("USD");
    }
}
