package org.example;

public class ExceptionHandling {
    int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Cannot divide by zero");
        return a/b;
    }
}
