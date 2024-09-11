package InterfaceQuiz;

public class Product implements Promotion {
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
        // instanceof 사용
        if (this instanceof Beauty) {
            return 10000;
        } else if (this instanceof Grocery) {
            return 2000;
        }
        return 0;
    }
}
