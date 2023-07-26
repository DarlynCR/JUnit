package com.darlyncr.temperatureconverter;

import java.text.DecimalFormat;

public class TemperatureConverter {


    public TemperatureConverter() { }


    public String convertTo(Double unit, String typeInitial, String typeToConvert) {

        Double convertedUnit = unit;

        switch (typeInitial){
            case "C":
                switch (typeToConvert){
                    case "F":
                        convertedUnit = (unit * 9/5) + 32;
                        break;
                    case "K":
                        convertedUnit = unit + 273.15;
                        break;
                }
                break;
            case "F":
                switch (typeToConvert){
                    case "C":
                        convertedUnit = (unit - 32) * 5/9;
                        break;
                    case "K":
                        convertedUnit = (unit - 32) * 5/9 + 273.15;
                        break;
                }
                break;
            case "K":
                switch (typeToConvert){
                    case "F":
                        convertedUnit = (unit - 273.15) * 9/5 + 32;
                        break;
                    case "C":
                        convertedUnit = unit - 273.15;
                        break;
                }
                break;
        }

        DecimalFormat format = new DecimalFormat("#,###.000");

        return format.format(convertedUnit);

    }
}
