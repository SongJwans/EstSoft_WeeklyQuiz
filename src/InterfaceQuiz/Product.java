package InterfaceQuiz;

public abstract class Product implements Promotion {
    String name;
    int price;
    int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price - getDiscountAmount();
        this.weight = weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
