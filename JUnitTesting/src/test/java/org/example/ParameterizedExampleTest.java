package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
class ParameterizedExampleTest {
    ParameterizedExample obj = new ParameterizedExample();
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void testEven(int num){
        assertTrue(obj.isEven(num),"Not Even");
    }
  
}