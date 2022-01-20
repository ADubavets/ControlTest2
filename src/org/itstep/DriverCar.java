package org.itstep;

import java.text.ParseException;

public class DriverCar implements Comparable<DriverCar> {
    private final String name;
    private final String surName;
    private double salary;
    private boolean onRoad;
    private boolean onWork;

    public DriverCar(String name,
                     String surName,
                     double salary,
                     boolean onRoad,
                     boolean onWork) throws ParseException {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.onRoad = onRoad;
        this.onWork = onWork;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public boolean isOnRoad() {
        return onRoad;
    }

    public void setOnRoad(boolean onRoad) {
        this.onRoad = onRoad;
    }

    public boolean isOnWork() {
        return onWork;
    }

    public void setOnWork(boolean onWork) {
        this.onWork = onWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(DriverCar d) {
        return name.compareTo(d.getName());
    }

    public String toString() {
        String sWork = "нет";
        if (isOnWork()) sWork = "да";
        String sRoad = "нет";
        if (isOnRoad()) sRoad = "да";
        String result = String.format("Водитель: %s %s, часовой оклад: %f, " +
                        "выход на работу: %s, выезд: %s %n",
                getName(),
                getSurName(),
                getSalary(),
                sWork,
                sRoad);
        return result;
    }


}
