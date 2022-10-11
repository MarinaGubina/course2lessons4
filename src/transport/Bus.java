package transport;

public class Bus extends Car{
    public Bus(String brand, String model, double engineVolume) {
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
        return "Bus - "+ super.toString();
    }
}
