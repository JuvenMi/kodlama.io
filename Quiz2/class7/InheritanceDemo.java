package Quiz2.class7;

public class InheritanceDemo {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new AgricultureCreditManager());
        creditUI.calculateCredit(new CustomerCreditManager());
    }
}
