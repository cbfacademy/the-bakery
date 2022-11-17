package com.codingblackfemales.bakery;

public class WithSayingCake extends Cake {
    private final Cake cake;
    private final String saying;

    public WithSayingCake(final Cake cake, final String saying) {
        this.cake = cake;
        this.saying = saying;
    }

    @Override
    public int getCost() {
        return this.cake.getCost();
    }

    @Override
    public String getDescription() {
        return this.cake.getDescription() + " with saying " + this.saying;
    }
}
