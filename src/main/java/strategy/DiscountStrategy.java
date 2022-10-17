package strategy;

import java.math.BigDecimal;
import java.util.function.Function;

public class DiscountStrategy {
    private Discount discount;

    public DiscountStrategy(Discount discount) {
        this.discount = discount;
    }
    public BigDecimal getPrice(BigDecimal price){
       return discount.calculateDiscount(price);
    }

}
