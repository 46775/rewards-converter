public class RewardValue {
    // Fields to store cash and miles values
    private double cashValue;
    private double milesValue;

    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        } else {
            throw new IllegalArgumentException("Invalid argument for miles constructor");
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Test the class with cash value
        RewardValue reward1 = new RewardValue(100);
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        // Test the class with miles value
        RewardValue reward2 = new RewardValue(20000, true);
        System.out.println("Cash Value: " + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }
}
