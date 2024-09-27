package InterfaceQuiz;

import java.math.BigDecimal;

public class Grocery extends Product {
    public Grocery(String name, BigDecimal price, int weight) {
        super(name, price, weight);
    }
    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.valueOf(2000);
    }
}
