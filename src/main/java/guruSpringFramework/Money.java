package guruSpringFramework;

public abstract class Money {
    protected int amount;

    protected abstract String currency();

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Frank frank(int amount) {
        return new Frank(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.getClass().equals(object.getClass());
    }
}
