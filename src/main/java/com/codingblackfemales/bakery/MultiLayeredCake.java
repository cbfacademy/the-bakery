package com.codingblackfemales.bakery;

public class MultiLayeredCake extends Cake {

    private static final int MULTILAYERED_CAKE_COST = 5;
    private final Cake cake;

    public MultiLayeredCake(final Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return this.cake.getCost() + MULTILAYERED_CAKE_COST;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + this.cake.getDescription();
    }
}
