package com.advance;

import com.advance.temperature_converter.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTemperatureConverter {

    double cel=34.2;
    double fah=93.56;

    @Test
    void testCelToFah(){
        Assertions.assertEquals(93.56, TemperatureConverter.celsiusToFahrenheit(34.2));
    }

    @Test
    void testFahToCel(){
        Assertions.assertEquals(34.2, TemperatureConverter.fahrenheitToCelsius(93.56));
    }
}
