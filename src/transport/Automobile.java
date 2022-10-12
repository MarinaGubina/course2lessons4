package transport;

import java.time.LocalTime;

public class Automobile extends Car implements Competing{
    public enum TypeOfAutomobile{
        SEDAN("Седан"), HATCHBACK("Хетчбек"), COUPE("Купе"),
        UNIVERSAL("Универсал"),SUV("Внедорожник"),CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),VAN("Фургон"), MINIVAN("Минивэн");
        private final String type;
        TypeOfAutomobile(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
    public Automobile(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println(" здесь был пит-стоп ");
    }

    @Override
    public double maxSpeed() {
        return 200;
    }

    @Override
    public LocalTime bestTime() {
        return LocalTime.of(0,12,4);
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
        return "Automobile - " + super.toString() ;
    }
}
