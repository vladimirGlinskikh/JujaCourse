package laboratoryWork.lab19;

public class ExchangeMoney {


    public static void main(String[] args) {
        System.out.println(exchangeAmountOfCoinsBrutForce(19));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int[] coinNominals = new int[]{1, 2, 5, 10, 25, 50};
        if (amountForExchange <= 0)
            return 0;
        int nominalsCount = coinNominals.length;
        int combinations[][] = new int[amountForExchange + 1][nominalsCount];

        for (int i = 0; i < nominalsCount; i++) {
            combinations[0][i] = 1;
        }

        for (int number = 1; number <= amountForExchange; number++) {
            for (int nominalsIndex = 0; nominalsIndex < nominalsCount; nominalsIndex++) {
                int current = 0;
                if (coinNominals[nominalsIndex] <= number) {
                    int rest = number - coinNominals[nominalsIndex];
                    current = combinations[rest][nominalsIndex];
                }

                int previous = 0;
                if (nominalsIndex >= 1) {
                    previous = combinations[number][nominalsIndex - 1];
                }
                combinations[number][nominalsIndex] = current + previous;
            }
        }
        return combinations[amountForExchange][nominalsCount - 1];
    }
}
