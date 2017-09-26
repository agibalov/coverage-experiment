package me.loki2302.adder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderServiceTest {
    @Test
    public void dummy() {
        AdderService adderService = new AdderService();
        assertEquals(5, adderService.add(2, 3));
    }
}
