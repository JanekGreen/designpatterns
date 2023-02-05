package strategy.discount;

import java.math.BigDecimal;

public class BirthdayDiscount implements Discount{
    @Override
    public BigDecimal calculateDiscount(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.5d));
    }
}
