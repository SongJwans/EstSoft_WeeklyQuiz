package InterfaceQuiz;

public class Cart {
    Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    // 무게의 총합 계산
    int calculateWeightAmount() {
        int weightAmount = 0;
        for (Product product : products) {
            weightAmount += product.weight;
        }
        return weightAmount;
    }
    // 가격의 총합 계산
    int calculatePriceAmount() {
        int priceAmount = 0;
        for (Product product : products) {
            priceAmount += product.price;
        }
        return priceAmount;
    }

    // 배송비 총합 계산
    public int calculateDeliveryCharge() {
        int weightAmount = calculateWeightAmount();
        int priceAmount = calculatePriceAmount();

        int deliveryCharge;

        // 무게에 따른 배송비
        if (weightAmount < 3) {
            deliveryCharge = 1000;
        } else if (weightAmount >= 3 && weightAmount < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        // 가격에 따른 배송비
        if (priceAmount >= 30000 && priceAmount < 100000) {
            deliveryCharge = deliveryCharge - 1000;
        } else if (priceAmount >= 100000) {
            deliveryCharge = 0;
        }

        return deliveryCharge;
    }
}
