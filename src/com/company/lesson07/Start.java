package com.company.lesson07;

public class Start
{
    public static void main(String[] args)
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
            if (country.isUsd()) {
                System.out.println(country.getName());
            }
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
