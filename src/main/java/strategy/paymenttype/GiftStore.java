package strategy.paymenttype;

public class GiftStore {

    private PaymentType paymentType;

    public GiftStore(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void realizePayment(double amount) {
        paymentType.pay(amount);
    }

    /*jak najbardziej możliwa rzecz, stworzyć setter dla strategii*/
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

}
