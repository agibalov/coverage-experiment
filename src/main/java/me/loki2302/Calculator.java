package me.loki2302;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
