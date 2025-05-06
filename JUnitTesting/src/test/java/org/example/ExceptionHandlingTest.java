package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
    ExceptionHandling excep = new ExceptionHandling();
    @Test
    void testDivide(){
        assertThrows(ArithmeticException.class,() -> excep.divide(2,0));
    }
}