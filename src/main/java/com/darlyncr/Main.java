package com.darlyncr;

import com.darlyncr.discountcalculator.DiscountCalculator;
import com.darlyncr.discountcalculator.Product;
import com.darlyncr.temperatureconverter.Temperature;
import com.darlyncr.temperatureconverter.TemperatureConverter;

public class Main {
    public static void main(String[] args) {

        newExercise("DiscountCalculator");

        discountCalculator();

        newExercise("TemperatureConverter");

        temperatureConverter();

    }

    private static void newExercise(String nameExercise){
        System.out.println( "===========================================================" );
        System.out.println( "Ejercicio " + nameExercise );

    }

    private static void discountCalculator(){

        Product product = new Product("Leche", 15.000);

        DiscountCalculator productWithDiscount = new DiscountCalculator(product, 20);

        System.out.println( "Producto: " + product.getNameProduct() + " con descuento: "+ productWithDiscount.getPriceWithDiscount() );
    }

    private static void temperatureConverter() {

        Temperature temperature = new Temperature();

        temperature.setType("F");

        temperature.setUnit(35.0);

        TemperatureConverter temperatureConverter = new TemperatureConverter();

        String convertedUnit = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(), "K");

        System.out.println(convertedUnit);

    }
}