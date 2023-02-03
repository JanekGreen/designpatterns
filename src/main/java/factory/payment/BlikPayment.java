package factory.payment;

public class BlikPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Pay by Blik");
    }
}
