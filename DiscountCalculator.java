public class DiscountCalculator {
    private static final double DISCOUNT_RATE = 0.1;

    public static double applyDiscount(double total) {
        return total - (total * DISCOUNT_RATE);
    }
}
