package strategy.discount;

import java.math.BigDecimal;

public class EasterDiscount implements Discount{

    @Override
    public BigDecimal calculateDiscount(BigDecimal price) {
        return  price.multiply(BigDecimal.valueOf(0.9d));
    }

}
