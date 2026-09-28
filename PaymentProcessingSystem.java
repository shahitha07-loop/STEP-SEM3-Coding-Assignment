public class PaymentProcessingSystem {

    interface PaymentMethod {
        boolean processPayment();
    }

    static class CreditCardPayment implements PaymentMethod {
        public boolean processPayment() {
            return true;
        }
    }

    static class PayPalPayment implements PaymentMethod {
        public boolean processPayment() {
            return false;
        }
    }

    static class Product {
        String name;

        Product(String n) {
            name = n;
        }
    }

    static class Order {
        int items;
        String status = "Pending";
    }

    public static void main(String[] args) {

        Order o = new Order();

        o.items = 1;

        PaymentMethod p = new CreditCardPayment();

        if (o.items == 0)
            System.out.println("Cannot process empty order");
        else if (p.processPayment()) {
            o.status = "Paid";
            System.out.println("Order Status: " + o.status);
        }
    }
}