package Quiz2.class5;

public class Constructor {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 5000);
        System.out.println("Name: " + product1.name
                         + "\nPrice: " + product1.price
                         + "\nID: " + product1.id);
    }
}
