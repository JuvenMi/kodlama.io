package Quiz2.class6;

public class CustomerManager extends PersonManager {
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " numaralı müşteri kaydedildi.");
    }
}

