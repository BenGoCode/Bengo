package org.example.Coin;

import org.example.Coin.Coin;

public class USD extends Coin {
    final double VALUE = 3.52;

    @Override
    public double getValue() {
        return VALUE;
    }

    @Override
    public double calculate(double d) {
        //System.out.println(d/getValue());
        return d/getValue();
    }
}
