package transport;

import java.time.LocalTime;
import java.util.Random;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println(" здесь был пит-стоп ");
    }

    @Override
    public double maxSpeed() {
        return 120;
    }

    @Override
    public LocalTime bestTime() {
        return LocalTime.of(0,20,3);
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
        return "Bus - "+ super.toString();
    }
}
