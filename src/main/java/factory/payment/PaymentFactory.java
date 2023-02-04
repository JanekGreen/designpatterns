package factory.payment;

public class PaymentFactory {

    public Payment getPaymentMethod(PaymentType paymentType) {
        if (paymentType == PaymentType.CARD) {
            return new CardPayment();
        }
        if (paymentType == PaymentType.BLIK) {
            return new BlikPayment();
        }
        return null;
    }

}
