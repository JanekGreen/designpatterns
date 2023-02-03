package factory.payment;

public class CardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Paid by credit card");
    }
}
