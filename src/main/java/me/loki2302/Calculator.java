package me.loki2302;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if(b == 0) {
            throw new RuntimeException();
        }

        return a / b;
    }
}
