package transport;

public class Automobile extends Car {
    public Automobile(String brand, String model, double engineVolume) {
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
        return "Automobile - " + super.toString() ;
    }
}
