package anotherExperiments.arrays;

import java.util.Arrays;

public class CompoundInterest {
    public static void main(String[] args) {
        final double START_RATE = 9.34;
        final int N_RATES = 7;
        final int N_YEARS = 10;

        double[] interestRate = new double[N_RATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (START_RATE + j) / 100.0;

        double[][] balances = new double[N_YEARS][N_RATES];

        Arrays.fill(balances[0], 10_000);

        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        for (double v : interestRate)
            System.out.printf("%9.0f%%", 100 * v);
        System.out.println();

        for (double[] row : balances) {
            for (double b : row)
                System.out.printf("%10.2f", b);
            System.out.println();
        }
    }
}
