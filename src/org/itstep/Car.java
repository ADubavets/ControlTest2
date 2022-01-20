package org.itstep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car implements Comparable<Car>{
    private String number;
    private CarColor color;
    private double loadLCapacity;
    private Date dateRelease;
    private String sDateRelease;
    private double price;
    private boolean onRoad = false;


    public Car(CarType car,
               String number,
               CarColor color,
               double loadLCapacity,
               String sDateRelease,
               double price,
               boolean onRoad) throws ParseException {
        this.number = number;
        this.color = color;
        this.loadLCapacity = loadLCapacity;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.sDateRelease = String.valueOf(dateFormat.parse(sDateRelease));
        this.price = price;
        this.onRoad = onRoad;

    }

    public double getLoadLCapacity() {
        return loadLCapacity;
    }

    public Date getDate() {
        return dateRelease;
    }

    public String getNumber() {
        return number;
    }

    public String getsDateRelease() {
        return sDateRelease;
    }

    @Override
    public int compareTo(Car car) {
        Date date1 = getDate();
        Date date2 = car.getDate();
        return date1.compareTo(date2);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarColor getColor() {
        return color;
    }

    public boolean isOnRoad() {
        return onRoad;
    }

    public void setOnRoad(boolean onRoad) {
        this.onRoad = onRoad;
    }

}

