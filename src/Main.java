public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ниссан", 4);
        Car car2 = new Car("Тойота", 4);


        Truck truck = new Truck("Маз", 8);
        Truck truck2 = new Truck("Мерседес", 8);


        Bicycle bicycle = new Bicycle("Спортивный велосипед", 2);
        Bicycle bicycle2 = new Bicycle("Горный велосипед",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle2);

    }
}