package strategy.paymenttype;

public class PaymentByCash implements PaymentType{
    @Override
    public void pay(double amount) {
        System.out.println("Payment by cash: "+ amount);
    }
}
