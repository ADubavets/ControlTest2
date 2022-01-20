package org.itstep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RoadList {
    private Date date;
    private String sDate;
    private String outRoute;
    private String inRoute;
    private String sCargo;
    private double cargo;

    public RoadList(String sDate, String outRoute, String inRoute, String sCargo, double cargo) throws ParseException {
        this.sDate = sDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.date = dateFormat.parse(sDate);
        this.outRoute = outRoute;
        this.inRoute = inRoute;
        this.sCargo = sCargo;
        this.cargo = cargo;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getOutRoute() {
        return outRoute;
    }

    public void setOutRoute(String outRoute) {
        this.outRoute = outRoute;
    }

    public String getInRoute() {
        return inRoute;
    }

    public void setInRoute(String inRoute) {
        this.inRoute = inRoute;
    }

    public String getsCargo() {
        return sCargo;
    }

    public void setsCargo(String sCargo) {
        this.sCargo = sCargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public String toString(){
        String result = String.format("Маршрут: %s - %s, дата выезда: %s, описание груза: %s, грузоподъемность: %f, %n",
                getOutRoute(), getInRoute(), getsDate(), getsCargo(),getCargo());
        return result;
    }
}
