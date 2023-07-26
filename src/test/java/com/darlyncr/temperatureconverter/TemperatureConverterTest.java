package com.darlyncr.temperatureconverter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    Temperature temperature;
    TemperatureConverter temperatureConverter;

    @BeforeEach
    void setUp() {
        temperature = new Temperature();
        temperatureConverter = new TemperatureConverter();
    }

    @AfterEach
    void tearDown() {

        temperature = null;
        temperatureConverter = null;
    }

    @Test
    void testConvertCelsiusToFahrenheit(){

        temperature.setUnit(35.0);
        temperature.setType("C");

        String result = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(),"F" );

        assertEquals("95,000", result);

    }

    @Test
    void testConvertFahrenheitToCelsius(){

        temperature.setUnit(35.0);
        temperature.setType("F");

        String result = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(),"C" );

        assertEquals("1,667", result);

    }

    @Test
    void testConvertKelvinToCelsius(){

        temperature.setUnit(35.0);
        temperature.setType("K");

        String result = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(),"C" );

        assertEquals("-238,150", result);

    }

    @Test
    void testConvertCelsiusToKelvin(){

        temperature.setUnit(35.0);
        temperature.setType("C");

        String result = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(),"K" );

        assertEquals("308,150", result);

    }

    @Test
    void testConvertKelvinToFahrenheit(){

        temperature.setUnit(35.0);
        temperature.setType("K");

        String result = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(),"F" );

        assertEquals("-396,670", result);

    }

    @Test
    void testConvertFahrenheitToKelvin(){

        temperature.setUnit(35.0);
        temperature.setType("F");

        String result = temperatureConverter.convertTo(temperature.getUnit(), temperature.getType(),"K" );

        assertEquals("274,817", result);

    }


}