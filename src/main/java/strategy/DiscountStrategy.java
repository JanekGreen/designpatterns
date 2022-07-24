package strategy;

import java.math.BigDecimal;
import java.util.function.Function;

public class DiscountStrategy {
    private Discount discount;
   private Function<BigDecimal, BigDecimal> discountFunc;

/*    public DiscountStrategy(Discount discount) {
        this.discount = discount;
    }*/
    public DiscountStrategy(Function<BigDecimal, BigDecimal> discountFunc) {
       this.discountFunc = discountFunc;
    }
    public BigDecimal getPrice(BigDecimal price){
       return discount.calculateDiscount(price);
    }
    public BigDecimal getPriceFunc(BigDecimal price){
        return discountFunc.apply(price);
    }

}
