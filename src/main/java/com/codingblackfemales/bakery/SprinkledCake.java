package com.codingblackfemales.bakery;

public class SprinkledCake extends Cake {

    private static final int SPRINKLED_CAKE_COST = 2;
    private final Cake cake;

    public SprinkledCake(final Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return this.cake.getCost() + SPRINKLED_CAKE_COST;
    }

    @Override
    public String getDescription() {
        return this.cake.getDescription() + " with sprinkles";
    }
}
