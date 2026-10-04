package question1_4;

public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule module = new PaymentModule();

        Employee m1 = new Manager("Alice", 50000, 12);

        Employee h1 = new Hourly("Bob", 150, 40);

        module.payment(m1);
        module.payment(h1);

        System.out.println("Total Payment Amount: " + module.getTotalPay());
    }
}