package InterfaceQuiz;

import static InterfaceQuiz.Policy.*;

import java.math.BigDecimal;

public class Cart {
    private Product[] products;
    private BigDecimal totalPrice;
    private int totalWeight;


    public Cart(Product[] products) {
        this.products = products;
        this.totalPrice = BigDecimal.ZERO;
        for (Product product : products) {
            this.totalPrice = totalPrice.add(product.getPrice());
            this.totalWeight += product.getWeight();

        }
    }

    // 배송비 총합 계산
    public int calculateDeliveryCharge() {
        int deliveryCharge = getDeliveryChargeWeightPolicy(totalWeight);

        // 가격에 따른 배송비
        if (totalPrice.compareTo(PRICE_POLICY_LEVEL_1) < 0) {
            return deliveryCharge;
        } else if (totalPrice.compareTo(PRICE_POLICY_LEVEL_2) < 0) {
            return deliveryCharge - DELIVERY_DISCOUNT_AMOUNT;
        }
        return DELIVERY_CHARGE_FREE;
    }


}
