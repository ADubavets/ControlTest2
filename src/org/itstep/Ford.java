package org.itstep;

import java.text.ParseException;

public class Ford extends Car{
    private ModelFord model;

    public Ford(CarType car,
                ModelFord model,
                String number,
                CarColor color,
                double loadLCapacity,
                String sDateRelease,
                double price,
                boolean onRoad) throws ParseException {
        super(car, number, color, loadLCapacity, sDateRelease, price, onRoad);
        this.model = model;
    }

    public String toString(){
        String str = " в гараже";
        if (isOnRoad()) str = " на выезде";
        String result = String.format("FORD: %s, цвет: %s, гос.номер: %s, грузоподъемность: %s, дата выпуска: %s, " +
                        "Стоимость: %f, статус: %s %n", getModel(), getColor(), getNumber(), getLoadLCapacity(),
                getsDateRelease(),getPrice(),str);
        return result;
    }

    public ModelFord getModel() {
        return model;
    }
}
