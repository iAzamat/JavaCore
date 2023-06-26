package Homeworks.HW4;

public enum DiscountSize {
    NO_DISCOUNT(0),
    DISCOUNT_5(0.05),
    DISCOUNT_10(0.1),
    DISCOUNT_15(0.15),
    DISCOUNT_20(0.2);

    private final double discountValue;

    public double getDiscountValue() {
        return discountValue;
    }

    DiscountSize(double discountValue) {
        this.discountValue = discountValue;
    }


}
