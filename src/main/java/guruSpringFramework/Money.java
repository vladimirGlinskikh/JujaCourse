package guruSpringFramework;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency() {
        return currency;
    }

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Frank frank(int amount) {
        return new Frank(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.getClass().equals(object.getClass());
    }
}
