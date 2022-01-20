package org.itstep;

import java.util.Collections;
import java.util.LinkedList;

public class CommandCar {
    private LinkedList<DriverCar> driverCars = new LinkedList<>();
    private LinkedList<Car> cars = new LinkedList<>();
    private LinkedList<RoadList> roadLists = new LinkedList<>();

    public void addDriverCar(DriverCar driverCar){
        driverCars.add(driverCar);
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void addRoadList(RoadList roadList){
        roadLists.add(roadList);
    }

    public void sort(){
        Collections.sort(driverCars);
    }

    public double getPrice(){
        double price = 0;
        for (Car car: cars) price += car.getPrice();
        for (DriverCar driverCar: driverCars) price += driverCar.getSalary();
        return price;
    }

    public String toString(){
        StringBuilder sb = new  StringBuilder();
        sb.append("Экипаж: \n");
        for (DriverCar driverCar: driverCars) sb.append(driverCar.toString());
        sb.append("Обслужываемая машина: \n");
        for (Car car: cars) sb.append(car.toString());
        if (!roadLists.isEmpty()) {
            sb.append("Выписано маршрутных листов: \n");
            for (RoadList roadList : roadLists) sb.append(roadList.toString());
        }
        return sb.toString();
    }

}
