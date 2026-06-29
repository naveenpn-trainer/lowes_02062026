package lowes.utils.parameterization;

import lowes.utils.StringHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class _02 {

    @ParameterizedTest
    @CsvSource({
            "AABB,BB",
            "ABB,BB",
            "BB,BB"
    })
    public void test(String input, String output) {
        assertEquals(output, StringHelper.truncateAInFirst2Positions(input));
    }
}
