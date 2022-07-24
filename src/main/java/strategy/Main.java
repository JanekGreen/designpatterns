package strategy;

import java.math.BigDecimal;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
/*      DiscountStrategy strategy = new DiscountStrategy(new ChristmasDiscount());
        BigDecimal price = strategy.getPrice(BigDecimal.valueOf(100d));
        System.out.println(price);
        strategy = new DiscountStrategy(new EasterDiscount());
        price = strategy.getPrice(BigDecimal.valueOf(100d));
        System.out.println(price);
        BigDecimal originalPrice = BigDecimal.valueOf(100d);*/
        DiscountStrategy functionStrategy = new DiscountStrategy(originalPrice -> originalPrice.multiply(BigDecimal.valueOf(0.80d)));
        BigDecimal priceFunc = functionStrategy.getPriceFunc(BigDecimal.valueOf(100d));
        System.out.println("func "+priceFunc);

    }

}
