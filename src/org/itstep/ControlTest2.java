package org.itstep;

import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Stack;

public class ControlTest2 {
    public static void main(String[] args) throws ParseException, IOException {
        // Грузовые перевозки.
        //Имеются автомобили разной грузоподъемности.
        //К каждому автомобилю прикреплен водитель.
        LinkedList<Car> cars = new LinkedList<>();

        CommandCar commandCar1 = new CommandCar();
        Mercedes mercedes1 = new Mercedes(
                CarType.MERCEDES,
                ModelMercedes.Actros,
                "45-55 ВТ 2",
                CarColor.BLACK,
                25,
                "25.12.1996",
                100,
                true);
        DriverCar driverCar1 = new DriverCar(
                "Иван",
                "Иванов",
                15,
                true,
                true);
        DriverCar driverCar2 = new DriverCar(
                "Петр",
                "Васильев",
                20,
                true,
                true);
        RoadList roadList1 = new RoadList(
                "15.01.2022",
                "Витебск",
                "Челябинск",
                "Транспортировка обуви",
                5.0);
        cars.add(mercedes1);
        commandCar1.addCar(mercedes1);
        commandCar1.addDriverCar(driverCar1);
        commandCar1.addDriverCar(driverCar2);
        commandCar1.addRoadList(roadList1);
        commandCar1.sort();
        //System.out.println(commandCar1.toString());
        //System.out.println("Стоимость: " + commandCar1.getPrice());
        //System.out.println();

        CommandCar commandCar2 = new CommandCar();
        Mercedes mercedes2 = new Mercedes(
                CarType.MERCEDES,
                ModelMercedes.Atego,
                "35-59 ВТ 2",
                CarColor.GREEN,
                10,
                "25.12.2001",
                80,
                false);
        cars.add(mercedes2);
        DriverCar driverCar3 = new DriverCar(
                "Сергей",
                "Иванов",
                20,
                false,
                true);
        DriverCar driverCar4 = new DriverCar(
                "Петр",
                "Афанасьев",
                30,
                false,
                true);
        commandCar2.addCar(mercedes2);
        commandCar2.addDriverCar(driverCar3);
        commandCar2.addDriverCar(driverCar4);
        commandCar2.sort();
        //System.out.println(commandCar2.toString());
        //System.out.println("Стоимость: " + commandCar2.getPrice());
        //System.out.println();

        CommandCar commandCar3 = new CommandCar();
        Mercedes mercedes3 = new Mercedes(
                CarType.MERCEDES,
                ModelMercedes.Zetros,
                "69-79 ВТ 2",
                CarColor.RED,
                16,
                "25.12.2008",
                90,
                false);
        cars.add(mercedes3);
        DriverCar driverCar5 = new DriverCar(
                "Сергей",
                "Петров",
                18,
                false,
                true);
        DriverCar driverCar6 = new DriverCar(
                "Илья",
                "Афанасьев",
                23,
                false,
                true);
        commandCar3.addCar(mercedes3);
        commandCar3.addDriverCar(driverCar5);
        commandCar3.addDriverCar(driverCar6);
        commandCar3.sort();
        //System.out.println(commandCar3.toString());
        //System.out.println("Стоимость: " + commandCar3.getPrice());
        //System.out.println();

        CommandCar commandCar4 = new CommandCar();
        Ford ford1 = new Ford(
                CarType.FORD,
                ModelFord.Cargo,
                "11-49 ВТ 2",
                CarColor.RED,
                5,
                "11.10.2005",
                60,
                false);
        cars.add(ford1);
        DriverCar driverCar7 = new DriverCar(
                "Илья",
                "Федоров",
                20,
                false,
                false);
        commandCar4.addCar(ford1);
        commandCar4.addDriverCar(driverCar7);
        commandCar4.sort();
        //System.out.println(commandCar4.toString());
        //System.out.println("Стоимость: " + commandCar4.getPrice());
        //System.out.println();

        CommandCar commandCar5 = new CommandCar();
        Ford ford2 = new Ford(
                CarType.FORD,
                ModelFord.Transit,
                "11-55 ВТ 2",
                CarColor.RED,
                2.5,
                "02.10.2005",
                50,
                false);
        cars.add(ford2);
        DriverCar driverCar8 = new DriverCar(
                "Илья",
                "Семенов",
                15,
                false,
                true);
        commandCar5.addCar(ford2);
        commandCar5.addDriverCar(driverCar8);
        commandCar5.sort();
        //System.out.println(commandCar5.toString());
        //System.out.println("Стоимость: " + commandCar5.getPrice());
        //System.out.println();

        //Вывести список свободных автомобилей, находящихся в автопарке и подходящих по грузоподъемности для перевозки указанного груза.
        System.out.println("Список машин находящихся в гараже и подходящих по грузоподъемности для перевозки груза в 15 тонн:");
        for (Car car : cars) {
            if ((!car.isOnRoad()) && (car.getLoadLCapacity() >= 15)) System.out.print(car.toString());
        }
        System.out.println();
        //Вывести список автомобилей, находящихся в рейсе на указанное время; их водителей, информацию о маршруте перевозки и грузе.

        Stack<CommandCar> carStack = new Stack<>();
        carStack.add(commandCar1);
        carStack.add(commandCar2);
        carStack.add(commandCar3);
        carStack.add(commandCar4);
        carStack.add(commandCar5);

        if (carStack.isEmpty() == false) {
            System.out.println("Список автомобилей, находящихся в рейсе на указанное время; их водителей, информацию о " +
                    "маршруте перевозки и грузе");
            while (carStack.size() > 0) {
                String s = carStack.pop().toString();
                if (s.indexOf("в гараже") == -1) {
                    System.out.println(s);
                }
            }
        }

    }

}
