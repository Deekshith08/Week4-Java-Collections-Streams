package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calci = new Calculator();

    @Test
    void testadd() {
        assertEquals(10,calci.add(5,5));
    }
    @Test
    void testsubtract(){
        assertEquals(2,calci.subtract(5,3));
    }
    @Test
    void testmultiply(){
        assertEquals(6,calci.multiply(2,3));
    }
    @Test
    void testdivide(){
        assertThrows(ArithmeticException.class,() -> calci.divide(2,0));
    }
}