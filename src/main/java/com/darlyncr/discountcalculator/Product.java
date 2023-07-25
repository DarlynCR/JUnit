package com.darlyncr.discountcalculator;

public class Product {

    private String nameProduct;
    private Double priceProduct;

    public Product(String nameProduct, Double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }


}
