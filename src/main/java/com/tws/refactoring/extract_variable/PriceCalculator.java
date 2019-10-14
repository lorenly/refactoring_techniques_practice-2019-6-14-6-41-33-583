package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public double getPrice(int quantity, int itemPrice) {
        double discount = getDiscount(quantity, itemPrice);
        double shippingCost = getShippingCost(quantity, itemPrice);

        return quantity * itemPrice - discount + shippingCost;
    }

    private double getDiscount(int quantity, int itemPrice) {
        double discount = 0.05;
        double itemWithDiscount = quantity - 500;
        return itemWithDiscount > 0 ? itemWithDiscount * itemPrice * discount : 0;
    }

    private double getShippingCost(int quantity, int itemPrice) {
        double shippingCostThreshold = quantity * itemPrice * 0.1;
        return Math.min(shippingCostThreshold, 100.0);
    }

}