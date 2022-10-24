package strategy.discount;

import java.math.BigDecimal;

public class PaymentService {
    private Discount discount;

    public PaymentService(Discount discount) {
        this.discount = discount;
    }
    public BigDecimal getPrice(BigDecimal price){
       /*nie wiemy nic o implementacji Discount
        tutaj nas ta implementacja nie interesuje*/
        return discount.calculateDiscount(price);
    }

}
