package InterfaceQuiz;

import java.math.BigDecimal;

public abstract class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private int weight;

    public Product(String name, BigDecimal price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price.subtract(getDiscountAmount());
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }
}
