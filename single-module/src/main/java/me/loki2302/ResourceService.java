package me.loki2302;

import java.io.Closeable;
import java.io.IOException;

public class ResourceService {
    // Both Jacoco and Cobertura say I only cover 4/8 branches here :-/
    public String work(boolean shouldThrowOnGetSomething) throws IOException {
        try(DummyResource r = new DummyResource(shouldThrowOnGetSomething)) {
            return r.getSomething();
        }
    }

    private static class DummyResource implements Closeable {
        private final boolean shouldThrowOnGetSomething;

        public DummyResource(boolean shouldThrowOnGetSomething) {
            this.shouldThrowOnGetSomething = shouldThrowOnGetSomething;
        }

        public String getSomething() {
            if(shouldThrowOnGetSomething) {
                throw new RuntimeException();
            }

            return "something";
        }

        @Override
        public void close() throws IOException {
        }
    }
}
