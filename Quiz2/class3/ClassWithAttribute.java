package Quiz2.class3;

public class ClassWithAttribute {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.price = 5000;
        product.description = "Asus Laptop";

        System.out.println("Product name: " + product.name
                         + "\nProduct id: " + product.id
                         + "\nProduct price: " + product.price
                         + "\nProduct description: " + product.description);

        System.out.println("----------------");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.remove(product);
        productManager.update(product);
    }
}
