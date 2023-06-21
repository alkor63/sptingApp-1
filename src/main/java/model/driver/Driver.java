package model.driver;

import model.trsnsport.Transport;

public class Driver {
    private final String driverName;
    private Transport transport;

    public Driver(String driverName, Transport transport) {
        this.driverName = driverName;
        this.transport = transport;
    }

    public void driverReadyToStart() {
        System.out.println(driverName + " сел(а) за руль и готов ехать ");
    }

    @Override
    public String toString() {
        return "Водитель " + driverName + " автомобиля " + transport.getBrand() + " " + transport.getModel();
    }
}
