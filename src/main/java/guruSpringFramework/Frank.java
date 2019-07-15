package guruSpringFramework;

public class Frank extends Money {
    private String currency;


    public Frank(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    protected String currency() {
        return currency;
    }

    @Override
    public Money times(int multiplier) {
        return new Frank(amount * multiplier);
    }
}
