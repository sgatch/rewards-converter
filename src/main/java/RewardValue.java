public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    public RewardValue (double cash) {
        cashValue = cash;
        milesValue = cashValue * 0.0035;
    }
    public RewardValue (int miles) {
        milesValue = miles;
        cashValue = milesValue / 0.0035;
    }
    public double getMilesValue() {
        return milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }
}
