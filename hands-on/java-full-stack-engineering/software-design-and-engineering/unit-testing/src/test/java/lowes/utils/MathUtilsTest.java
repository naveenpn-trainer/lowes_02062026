package lowes.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @DisplayName("Testing with positive Number")
    @Test
    public void testFactorial_WithPositiveInput(){
        assertEquals(6, MathUtils.factorial(3));
    }


    @Disabled
    @DisplayName("Testing with negative Number")
    @Test
    public void testFactorial_WithNegativeInput(){
        assertEquals(6, MathUtils.factorial(-3));
    }
}
