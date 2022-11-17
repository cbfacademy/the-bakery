package com.codingblackfemales;

import com.codingblackfemales.bakery.*;

/**
 * Create an order and print it
 */
public class Main {

    public static void main(String[] args) {
        // Create the order
        final Order order = new Order();

        // Create simple cakes
        final VanillaCake vanillaCake = new VanillaCake();
        final ChocolateCake chocolateCake = new ChocolateCake();
        final StrawberryCake strawberryCake = new StrawberryCake();

        // Create decorated cakes
        final WithSayingCake plainVanillaCake = new WithSayingCake(vanillaCake, "\"PLAIN!\"");
        final WithSayingCake fancySprinkledVanillaCake = new WithSayingCake(new SprinkledCake(vanillaCake), "\"FANCY!\"");
        final MultiLayeredCake multiLayeredCake = new MultiLayeredCake(
                new WithSayingCake(
                        new WithSayingCake(
                                new SprinkledCake(
                                        new SprinkledCake(strawberryCake)),
                                "\"One of\""),
                        "\"EVERYTHING\"")
        );

        order.addCake(chocolateCake);
        order.addCake(plainVanillaCake);
        order.addCake(fancySprinkledVanillaCake);
        order.addCake(multiLayeredCake);

        // Print the order
        order.printOrder();
    }
}
