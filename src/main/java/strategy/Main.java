package strategy;

import strategy.discount.ChristmasDiscount;
import strategy.discount.PaymentService;
import strategy.discount.EasterDiscount;
import strategy.paymenttype.GiftStore;
import strategy.paymenttype.PaymentByCard;
import strategy.paymenttype.PaymentByCash;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PaymentService strategy = new PaymentService(new ChristmasDiscount());
        BigDecimal price = strategy.getPrice(BigDecimal.valueOf(100d));
        System.out.println(price);
        strategy = new PaymentService(new EasterDiscount());
        price = strategy.getPrice(BigDecimal.valueOf(100d));
        System.out.println(price);
        BigDecimal originalPrice = BigDecimal.valueOf(100d);
        System.out.println(originalPrice);
        /*pokazać możliwość stworzenia strategii za pomocą intrfejsów funkcyjnych*/

        GiftStore giftStore = new GiftStore(new PaymentByCard());
        giftStore.realizePayment(100d);

        giftStore.setPaymentType(new PaymentByCash());
        giftStore.realizePayment(100d);



    }

}
