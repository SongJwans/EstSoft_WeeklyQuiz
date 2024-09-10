package InterfaceQuiz;

public class Cart {
    Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    int calculateWeightAmount() {
        int weightAmount = 0;

        for (Product product : products) {
            weightAmount += product.weight;
        }

        return weightAmount;
    }

    int calculatePriceAmount() {
        int priceAmount = 0;
        for (Product product : products) {
            priceAmount += product.price;
        }

        return priceAmount;
    }

    public int calculateDeliveryCharge() {
        int weightAmount = calculateWeightAmount();
        int priceAmount = calculatePriceAmount();

        int deliveryCharge;

        if (weightAmount < 3) {
            deliveryCharge = 1000;
        } else if (weightAmount >= 3 && weightAmount < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (priceAmount >= 30000 && priceAmount < 100000) {
            deliveryCharge = deliveryCharge - 1000;
        } else if (priceAmount >= 100000) {
            deliveryCharge = 0;
        }

        return deliveryCharge;
    }
}
