package lowes.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringHelperTest {

    @Test
    public void testTruncateAInFirst2Positions_02(){
        assertEquals("aabb"
                ,StringHelper.truncateAInFirst2Positions("aaaabb"));
    }

    @Test
    public void testTruncateAInFirst2Positions(){
        assertThrowsExactly(NullPointerException.class,
                ()->StringHelper.truncateAInFirst2Positions(null));
    }
}
