package transport;

import java.time.LocalTime;

public class Truck extends Car implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println(" здесь был пит-стоп ");
    }

    @Override
    public double maxSpeed() {
        return 140;
    }

    @Override
    public LocalTime bestTime() {
        return LocalTime.of(0,18,45);
    }

    @Override
    public void startMovement() {
        System.out.println("Начать движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Завершить движение");
    }

    @Override
    public String toString() {
        return "Truck - "+ super.toString();
    }
}
