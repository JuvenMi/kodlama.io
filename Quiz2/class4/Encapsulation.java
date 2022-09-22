package Quiz2.class4;

public class Encapsulation {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(5000);

        System.out.println("Product name: " + product.getName()
                + "\nProduct id: " + product.getId()
                + "\nProduct price: " + product.getPrice());
    }
}
