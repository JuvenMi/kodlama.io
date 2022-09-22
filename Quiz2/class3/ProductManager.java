package Quiz2.class3;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Product added: " + product.name);
    }

    public void remove(Product product) {
        System.out.println("Product removed: " + product.name);
    }

    public void update(Product product) {
        System.out.println("Product updated: " + product.name);
    }
}
