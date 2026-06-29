package org.lowes.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @Test
    void testAdd() {
        MathUtil calculator = new MathUtil();

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }
}
