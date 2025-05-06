package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();
    @Test
    void testValidatePassword(){
        assertTrue(validator.validate("Qwert12345"),"Invalid password");
    }
}