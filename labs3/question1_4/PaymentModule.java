package question1_4;

public class PaymentModule {
    protected double totalPay;

    public PaymentModule() {
        this.totalPay = 0;
    }

    public void payment(Employee e) {
        double currentPay = e.computePay();

        if (e instanceof Manager) {
            Manager m = (Manager) e;
            if (m.getWorkYear() > 10) {
                currentPay = currentPay * 2;
            }
        }
        this.totalPay += currentPay;
    }

    public double getTotalPay() {
        return totalPay;
    }
}