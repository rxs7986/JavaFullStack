
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(10.5); // Set the price for a single quantity

        double price = product.getPrice(); // Get the price for a single quantity
        System.out.println("Price for a single quantity: " + price);

        int quantity = 5;
        double totalPrice = product.getPrice(quantity); // Get the price for a specified quantity
        System.out.println("Total price for " + quantity + " quantities: " + totalPrice);

    }
}