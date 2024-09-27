package InterfaceQuiz;

import java.math.BigDecimal;

public class Policy {
    static final BigDecimal PRICE_POLICY_LEVEL_1 = BigDecimal.valueOf(30_000);
    static final BigDecimal PRICE_POLICY_LEVEL_2 = BigDecimal.valueOf(100_000);
    static final int DELIVERY_DISCOUNT_AMOUNT = 1000;
    static final int DELIVERY_CHARGE_FREE = 1000;

    static final int WEIGHT_POLICY_LEVEL_1 = 3;
    static final int WEIGHT_POLICY_LEVEL_2 = 10;
    static final int WEIGHT_POLICY_LEVEL_1_DISCOUNT = 1000;
    static final int WEIGHT_POLICY_LEVEL_2_DISCOUNT = 5000;
    static final int WEIGHT_POLICY_LEVEL_3_DISCOUNT = 10_000;


    public static int getDeliveryChargeWeightPolicy(int totalWeight) {
        if (totalWeight < WEIGHT_POLICY_LEVEL_1) {
            return WEIGHT_POLICY_LEVEL_1_DISCOUNT;
        } else if (totalWeight < WEIGHT_POLICY_LEVEL_2) {
            return WEIGHT_POLICY_LEVEL_2_DISCOUNT;
        }
        return WEIGHT_POLICY_LEVEL_3_DISCOUNT;

    }
}
