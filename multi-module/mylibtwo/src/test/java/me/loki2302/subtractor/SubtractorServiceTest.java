package me.loki2302.subtractor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractorServiceTest {
    @Test
    public void dummy() {
        SubtractorService subtractorService = new SubtractorService();
        assertEquals(-1, subtractorService.subtract(2, 3));
    }
}
