package com.darlyncr.discountcalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    private Product product;
    private DiscountCalculator priceWithDiscount;

    @BeforeEach
    void setUp() {

        product = new Product("Leche", 15.000);

    }

    @AfterEach
    void tearDown() {

        product = null;
        priceWithDiscount = null;

    }

    @Test
    void testProductPriceWithoutDiscount() {

        priceWithDiscount = new DiscountCalculator(product, 0);

        String result = priceWithDiscount.getPriceWithDiscount();

        assertEquals("15,000", result);

    }


    @Test
    void testProductPriceWithDiscountofDefault() {

        priceWithDiscount = new DiscountCalculator(product, 25);

        String result = priceWithDiscount.getPriceWithDiscount();

        assertEquals("10,500", result);

    }

    @Test
    void testProductPriceWithoutDiscountOf10Percent() {

        priceWithDiscount = new DiscountCalculator(product, 10);

        String result = priceWithDiscount.getPriceWithDiscount();

        assertEquals("13,500", result);

    }

    @Test
    void testProductPriceWithoutDiscountOf20Percent() {

        priceWithDiscount = new DiscountCalculator(product, 20);

        String result = priceWithDiscount.getPriceWithDiscount();

        assertEquals("12,000", result);

    }

}