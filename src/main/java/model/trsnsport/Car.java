package model.trsnsport;

public class Car extends Transport {

    private final double maxSpeed;

    public Car(String brand, String model,int year, double engineVolume, double maxSpeed) {
        super(brand, model, year, engineVolume);
        this.maxSpeed = maxSpeed;

    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + getBrand()+" "+ getModel() +
                " с максимальной скоростью =" + maxSpeed + "км/ч";
    }

}
