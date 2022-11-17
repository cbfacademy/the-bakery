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
        final SprinkledCake sprinkledCake = new SprinkledCake(vanillaCake);
        final WithSayingCake plainVanillaCake = new WithSayingCake(vanillaCake, "\"PLAIN!\"");
        final WithSayingCake fancySprinkledVanillaCake = new WithSayingCake(sprinkledCake, "\"FANCY!\"");

        final SprinkledCake sprinkledStrawberryCake = new SprinkledCake(strawberryCake);
        final SprinkledCake doubleSprinkledStrawberryCake = new SprinkledCake(sprinkledStrawberryCake);
        final WithSayingCake oneOfCake = new WithSayingCake(doubleSprinkledStrawberryCake, "\"One of\"");
        final WithSayingCake oneOfWithEverything = new WithSayingCake(oneOfCake, "\"EVERYTHING\"");
        final MultiLayeredCake multiLayeredCake = new MultiLayeredCake(oneOfWithEverything);

        order.addCake(chocolateCake);
        order.addCake(plainVanillaCake);
        order.addCake(fancySprinkledVanillaCake);
        order.addCake(multiLayeredCake);

        // Print the order
        order.printOrder();
    }
}
