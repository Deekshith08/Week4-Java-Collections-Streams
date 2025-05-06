package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {
    static StringUtility su;
    @BeforeAll
    static void setup() {
         su = new StringUtility();
    }
    @Test
    void testreverse(){
        assertEquals("sam",su.reverse("mas")," Not Reversed");
    }
    @Test
    void testPalindrome(){
        assertTrue(su.isPalindrome("mam"));
    }
    @Test
    void testUpperCase(){
        assertEquals("ABC",su.toUpperCase("abc"));
    }

}