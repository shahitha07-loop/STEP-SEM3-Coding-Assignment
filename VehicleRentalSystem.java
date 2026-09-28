public class VehicleRentalSystem {

    static abstract class Vehicle {
        String name;
        Vehicle(String n){ name=n; }
        abstract double calculateRent(int d);
    }

    static class Sedan extends Vehicle {
        Sedan(String n){ super(n); }
        double calculateRent(int d){ return d * 50; }
    }

    public static void main(String[] args) {
        Vehicle v = new Sedan("Sedan A");
        System.out.println(v.calculateRent(3));
    }
}