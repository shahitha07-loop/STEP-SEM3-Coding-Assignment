public class HotelBookingSystem {

    static abstract class Room {
        int roomNo;
        boolean available = true;

        Room(int n) {
            roomNo = n;
        }

        abstract double calculatePrice(int days);
    }

    static class StandardRoom extends Room {
        StandardRoom(int n) {
            super(n);
        }

        double calculatePrice(int d) {
            return d * 100;
        }
    }

    static class Customer {
        String name;

        Customer(String n) {
            name = n;
        }
    }

    public static void main(String[] args) {

        Room r = new StandardRoom(101);

        if (r.available) {
            r.available = false;
            System.out.println("Reservation Confirmed");
            System.out.println("Price = $" + r.calculatePrice(4));
        }

        if (!r.available)
            System.out.println("Room Not Available");

        r.available = true;

        System.out.println("Reservation Cancelled");
    }
}