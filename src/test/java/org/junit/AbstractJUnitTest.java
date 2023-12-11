package org.junit;

import org.junit.jupiter.api.Test;

public abstract class AbstractJUnitTest {

    @Test
    protected void someTestMethod() {
        System.out.println("This should not run as disabled by AnstractJUnitTest2");
        throw new RuntimeException("Should not be thrown");
    }

    @Test
    protected void anotherTestMethod() {
        System.out.println("This should run");
    }
}
