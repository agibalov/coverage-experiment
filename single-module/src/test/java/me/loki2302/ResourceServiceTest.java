package me.loki2302;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ResourceServiceTest {
    @Test
    public void canUseResourceService() throws IOException {
        assertEquals("something", new ResourceService().work(false));
    }

    @Test(expected = RuntimeException.class)
    public void whatHappensWhenGetSomethingThrows() throws IOException {
        new ResourceService().work(true);
    }
}
