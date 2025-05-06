package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();
    @Test
    void testCToF(){
        assertEquals(34.8,tc.celsiusToFahrenheit(1));
    }
    @Test
    void testFTOC(){
        assertEquals(1,tc.fahrenheitToCelsius(33.8));
    }
}