package strategy;

import java.math.BigDecimal;

public class ChristmasDiscount implements Discount {

    @Override
    public BigDecimal calculateDiscount(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.8d));
    }

}
