import transport.Automobile;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Automobile car1 = new Automobile("Lada","Grande",1.7, Automobile.TypeOfAutomobile.COUPE);
        Automobile car2 = new Automobile("Hyundai","Avante",1.6, Automobile.TypeOfAutomobile.SEDAN);
        Automobile car3 = new Automobile("BMW","Z8",3.0, Automobile.TypeOfAutomobile.UNIVERSAL);
        Automobile car4 = new Automobile("Kia","Sportage 4 поколение",2.4, Automobile.TypeOfAutomobile.SEDAN);
        System.out.println(car1.bestTime());
        System.out.println(car3.maxSpeed());
        car2.pitStop();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4 + "\n");

        Bus bus1 = new Bus("KIA","F-32", 2.4, Bus.CapacityBus.AVERAGE);
        Bus bus2 = new Bus("MAN","Lions's City", 3.2, Bus.CapacityBus.SMALL);
        Bus bus3 = new Bus("МАЗ","241", 2.6, Bus.CapacityBus.AVERAGE);
        Bus bus4 = new Bus("Hyundai","Country",2.9, Bus.CapacityBus.LARGE);
        System.out.println(bus4.bestTime());
        System.out.println(bus1.maxSpeed());
        bus2.pitStop();
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4 + "\n");

        Truck truck1 = new Truck("МАЗ","4317", 6.3, Truck.CapacityTruck.N1);
        Truck truck2 = new Truck("Hyundai","HD42", 5.2, Truck.CapacityTruck.N3);
        Truck truck3 = new Truck("MAN","TGL", 4.2, Truck.CapacityTruck.N2);
        Truck truck4 = new Truck("Ford","Transit", 6.4, Truck.CapacityTruck.N1);
        truck4.pitStop();
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4 + "\n");

        DriverCategoryB alex = new DriverCategoryB("Алексей","B",1,car3);
        DriverCategoryC sergey = new DriverCategoryC("Сергей","C",5,bus1);
        DriverCategoryD pavel = new DriverCategoryD("Павел","D",10,truck2);

        printInfo(alex);
        printInfo(sergey);
        printInfo(pavel);

    }

    public static void printInfo(Driver driver){
        System.out.println("водитель " + driver.toString()+
                " управляет автомобилем " + driver.getCar().toString() +
                " и будет участвовать в заезде");
        driver.getCar().printType();
    }
}