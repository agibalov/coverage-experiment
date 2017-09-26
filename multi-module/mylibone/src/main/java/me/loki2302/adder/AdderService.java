package me.loki2302.adder;

public class AdderService {
    public int add(int a, int b) {
        if(a == 2302) {
            throw new RuntimeException("Surprise");
        }

        return a + b;
    }
}
