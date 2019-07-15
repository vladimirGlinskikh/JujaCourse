package guruSpringFramework;

public class Frank extends Money {
    private String currency;


    public Frank(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {
        return currency;
    }

    @Override
    public Money times(int multiplier) {
        return Money.frank(amount * multiplier);
    }
}
