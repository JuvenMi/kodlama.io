package Quiz2.class2;

import Quiz2.class2.FourTransactions;

public class RecapDemo {
    public static void main(String[] args) {
        int total, extract, multiply, divide;
        FourTransactions ft = new FourTransactions();
        total = ft.total(1,2);
        extract = ft.exract(9,8);
        multiply = ft.multiply(3,4);
        divide = ft.divide(10,2);
        System.out.println("Total: " + total
                         + " Extract: " + extract
                         + " Multiply: " + multiply
                         + " Divide: " + divide);
    }
}
