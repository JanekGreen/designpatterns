package strategy.discount;

import java.math.BigDecimal;

public interface Discount {
    BigDecimal calculateDiscount(BigDecimal price); // metoda do implementacji w klasach które będą zniżkami
}
