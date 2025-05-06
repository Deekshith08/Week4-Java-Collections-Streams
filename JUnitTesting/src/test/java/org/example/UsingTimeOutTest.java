package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class UsingTimeOutTest {
    UsingTimeOut manager = new UsingTimeOut();
    @Test
    @Timeout(2)
    void testlongRunningTask() throws InterruptedException{
        String result = manager.longRunningTask();
        assertEquals("Task Completed", result);
    }
}