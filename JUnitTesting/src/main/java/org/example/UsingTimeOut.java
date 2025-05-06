package org.example;

public class UsingTimeOut {
    String longRunningTask() throws InterruptedException{
        Thread.sleep(3000);
        return "Task Completed";
    }
}
