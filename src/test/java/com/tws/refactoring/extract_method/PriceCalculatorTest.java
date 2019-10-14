package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void should_calculate_price_with_no_discount() {
        int quantity = 5;
        int itemPrice = 10;
        double discount = 0.0;
        double shippingCost = 5.0;
        PriceCalculator priceCalculator = new PriceCalculator();

        double totalPrice = priceCalculator.getPrice(quantity, itemPrice);
        double computedPrice = (quantity * itemPrice) - discount + shippingCost;
        assertEquals(computedPrice, totalPrice);
    }

    @Test
    public void should_calculate_price_with_discount() {
        int quantity = 5000;
        int itemPrice = 10;
        double discount = 2250.0;
        double shippingCost = 100.0;
        PriceCalculator priceCalculator = new PriceCalculator();

        double totalPrice = priceCalculator.getPrice(quantity, itemPrice);
        double computedPrice = (quantity * itemPrice) - discount;
        assertEquals( computedPrice+ shippingCost, totalPrice);
    }
}