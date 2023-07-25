package com.darlyncr.discountcalculator;

import java.text.DecimalFormat;

public class DiscountCalculator {

    private Product product;
    private int discount;

    private Double priceWithDiscount;


    public DiscountCalculator(Product product, int discount) {

        this.product = product;
        this.discount = discount;

        this.priceWithDiscount = generateDiscount(product.getPriceProduct(), discount);

    }

    private Double generateDiscount(Double price, int discount) {

        switch (discount) {
            case 0:
                return priceWithDiscount = price;
            case 10:
                return priceWithDiscount = price - (price * discount / 100);
            case 20:
                return priceWithDiscount = price - (price * discount / 100);
            default:
                return priceWithDiscount = price - (price * 30 / 100);
        }

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getPriceWithDiscount() {

        DecimalFormat format = new DecimalFormat("#,###.000");

        return format.format(priceWithDiscount);
    }

    public void setPriceWithDiscount(Double priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }



}
