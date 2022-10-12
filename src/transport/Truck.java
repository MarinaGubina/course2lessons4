package transport;

import java.time.LocalTime;

public class Truck extends Car implements Competing{
    public enum CapacityTruck{
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private final String capacity;
        CapacityTruck(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
    }
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
