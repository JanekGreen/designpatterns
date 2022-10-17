package strategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        DiscountStrategy strategy = new DiscountStrategy(new ChristmasDiscount());
        BigDecimal price = strategy.getPrice(BigDecimal.valueOf(100d));
        System.out.println(price);
        strategy = new DiscountStrategy(new EasterDiscount());
        price = strategy.getPrice(BigDecimal.valueOf(100d));
        System.out.println(price);
        BigDecimal originalPrice = BigDecimal.valueOf(100d);
        System.out.println(originalPrice);


    }

}
