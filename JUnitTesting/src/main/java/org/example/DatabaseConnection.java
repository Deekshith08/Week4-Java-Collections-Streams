package org.example;

public class DatabaseConnection {
    boolean connected;
    void connect(){
        connected = true;
        System.out.println("Database Connected");
    }
    void disconnect(){
        connected = false;
        System.out.println("Database diconnected");
    }
    boolean isConnected(){
        return connected;
    }
}
