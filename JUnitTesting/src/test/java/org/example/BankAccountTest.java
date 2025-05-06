package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount acc = new BankAccount();
    @Test
    void testdeposit(){
        acc.deposit(2000);
        assertEquals(12000,acc.getBalance());
    }
    @Test
    void testwithdraw(){
        acc.withdraw(2000);
        assertEquals(8000,acc.getBalance());
    }


}