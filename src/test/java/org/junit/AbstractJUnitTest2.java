package org.junit;

import org.junit.jupiter.api.Disabled;

public abstract class AbstractJUnitTest2 extends AbstractJUnitTest {

    @Override
    @Disabled
    protected void someTestMethod() {
        super.someTestMethod();
    }
}
