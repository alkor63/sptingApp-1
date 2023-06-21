package model.trsnsport;

public class Bus extends Transport {
    private final int passengers;

    public Bus(String brand, String model, int year, double engineVolume, int passengers) {
        super(brand, model, year, engineVolume);
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() +
                " вместимостью =" + passengers + " пассажиров";
    }
}
