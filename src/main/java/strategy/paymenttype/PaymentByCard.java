package strategy.paymenttype;

public class PaymentByCard implements PaymentType{
    @Override
    public void pay(double amount) {
        System.out.println("Payment by card: "+amount);
    }
}
