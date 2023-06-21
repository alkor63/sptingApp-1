package model.trsnsport;

public class Pickup extends Transport{
    private final int capacityKg;

    public Pickup(String brand, String model,int year, double engineVolume, int capacityKg) {
        super(brand, model, year, engineVolume);
        this.capacityKg = capacityKg;

    }


    @Override
    public String toString() {
        return "Пикап " + getBrand()+" "+ getModel() +
                " грузоподъемностью =" + capacityKg + " кг";
    }
}
