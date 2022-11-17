package com.codingblackfemales.bakery;

public class StrawberryCake extends Cake {

    @Override
    public int getCost() {
        return 2 * super.getCost();
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}
