package Quiz2.class6;

public class Inheritance {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customer.firstName = "Caner";
        customer.lastName = "Çin";
        customer.id = 1;
        customer.customerNumber = "12345";

        employee.firstName = "Engin";
        employee.lastName = "Demiroğ";
        employee.id = 1;
        employee.salary = 10000;

        customerManager.add(customer);
        employeeManager.add(employee);
    }
}
