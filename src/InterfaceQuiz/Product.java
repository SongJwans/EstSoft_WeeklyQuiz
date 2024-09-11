package InterfaceQuiz;

public abstract class Product implements Promotion {
    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price - getDiscountAmount();
        this.weight = weight;
    }
    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
