package model.trsnsport;
import java.util.Objects;
public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private double engineVolume;
    public Transport(String brand, String model, int year, double engineVolume) {
        if (nullString(brand)) brand = "Марка не определена";
        if (nullString(model)) model = "Неизвестная модель";
        if (year <= 1900) year = 2000;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return " " + brand + " " + model + " " + year + " года с двигаталем " + engineVolume + " л";
    }

    public static boolean nullString(String s) {
        return (s == null || s.isEmpty());
    }
}
