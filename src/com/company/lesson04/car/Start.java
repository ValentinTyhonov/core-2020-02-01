package com.company.lesson04.car;

public class Start
{
    public static void main(String[] args)
    {


        RegularCar car = new RegularCar("", "", "", new Engine("", 43), 33);
        RegularCar car1 = car;

        System.out.println(car.equals(car1));

        car.setColor("red");

        System.out.println(car.equals(car1));

        System.out.println(car1.getColor());

    }


    static void rr(RegularCar car34634436) {
        car34634436.setModel("vedefd");
    }
}