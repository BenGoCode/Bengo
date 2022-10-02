package org.example.Coin;

import org.example.Coin.Coin;

public class ILS extends Coin {
     final double VALUE = 0.28;

    @Override
    public double getValue() {
        return VALUE;
    }

    @Override
    public double calculate(double s) {
        //System.out.println(d/getValue());
        return s/getValue();
    }
}
