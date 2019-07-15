package guruSpringFramework;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    protected String currency() {
        return "USD";
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
