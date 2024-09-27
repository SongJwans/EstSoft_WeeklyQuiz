package InterfaceQuiz;

import java.math.BigDecimal;

public class Beauty extends Product {
    public Beauty(String name, BigDecimal price, int weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.valueOf(10000);
    }
}
