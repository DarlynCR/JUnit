package com.darlyncr;

import com.darlyncr.discountcalculator.DiscountCalculator;
import com.darlyncr.discountcalculator.Product;

public class Main {
    public static void main(String[] args) {


        Product product = new Product("Leche", 15.000);

        DiscountCalculator productWithDiscount = new DiscountCalculator(product, 20);

        System.out.println( productWithDiscount.getPriceWithDiscount() );


    }
}