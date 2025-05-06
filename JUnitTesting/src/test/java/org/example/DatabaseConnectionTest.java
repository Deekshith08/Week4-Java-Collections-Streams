package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    DatabaseConnection db;
    @BeforeEach
    void setUp(){
        db = new DatabaseConnection();
        db.connect();
    }
    @AfterEach
    void tearDown(){
        db.disconnect();
    }
    @Test
    void checkConnectionEstablished(){
        assertTrue(db.isConnected(),"Connection should be established");
    }
    @Test
    void checkConnectionClosed(){
        db.disconnect();
        assertFalse(db.isConnected(),"Connection should be closed");
    }

}