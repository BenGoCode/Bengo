package org.example.Coin;

public class CoinsFactory {
    public static Coin getCoin(String CoinType) {
        if (CoinType == null) {
            return null;
        } else if (CoinType.equalsIgnoreCase("USD")) {
            return new USD() {
                @Override
                public double getValue() {
                    return VALUE;
                }

                @Override
                public double calculate(double d) {
                    return VALUE;
                }
            };
        } else if (CoinType.equalsIgnoreCase("ILS")) {
            return new ILS();
        }
        return null;
    }
}
