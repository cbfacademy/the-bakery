package com.codingblackfemales;

import com.codingblackfemales.bakery.ChocolateCake;
import com.codingblackfemales.bakery.Order;
import com.codingblackfemales.bakery.VanillaCake;

/**
 * Create an order and print it
 */
public class Main {

    public static void main(String[] args) {
        // Create the order
        final Order order = new Order();
        order.addCake(new VanillaCake());
        order.addCake(new ChocolateCake());

        // Print the order
        order.printOrder();
    }
}
