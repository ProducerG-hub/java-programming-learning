package personal;

class Vehicle {
    public String brand;

    public void start(){
        System.out.println("Always Vehicles start");
    }
}

class Car extends Vehicle{
    @Override
    public void start() {
        super.start();
        brand = "Mazda Car: ";
        System.out.println(brand + "Car starts with key");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        brand = "Honda Bike: ";
        System.out.println(brand + "Bike starts with button");
    }
}

class Truck extends Vehicle{
    @Override
    public void start() {
        brand = "Scania Truck: ";
        System.out.println(brand + "Truck starts heavily");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.start();
        v2.start();
        v3.start();
    }

}
