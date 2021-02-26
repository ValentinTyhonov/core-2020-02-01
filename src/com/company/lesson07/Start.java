package com.company.lesson07;

import java.io.IOException;

public class Start
{
    public static void main(String[] args) throws Exception
    {
        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals) {
            System.out.println(signal.name() + " :: " + signal.ordinal());
        }

        for (int i = 0; i <= signals.length-1; i++) {
            TrafficSignal signal = signals[i];

            System.out.println(signal.name() + " :: " + signal.ordinal());
        }

        for (Country country : Country.values()) {
            try
            {
                if (country.isUsd()) {
                    System.out.println(country.getName());
                }
            }
            catch (IOException | NullPointerException e)
            {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Some unexxpected exception: " + e.getMessage());
            } finally
            {
                System.out.println("finally is here");
            }

            System.out.println("Proceed");
        }


        TrafficSignal someSignal = TrafficSignal.valueOf("green".toUpperCase());
        System.out.println(someSignal);
    }

    public static void carCheckToGo(TrafficSignal trafficSignal) {
        if (trafficSignal.equals(TrafficSignal.GREEN)) {
            System.out.println();
        }
    }

    public static void carCheckToGoString(String color) {
        if (color.equalsIgnoreCase(TrafficSignal.GREEN.name())) {
            System.out.println();
        }
    }
}
