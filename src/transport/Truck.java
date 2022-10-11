package transport;

public class Truck extends Car {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {

    }

    @Override
    public void finishMovement() {

    }

    @Override
    public String toString() {
        return "Truck - "+ super.toString();
    }
}
