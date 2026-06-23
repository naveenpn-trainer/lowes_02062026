package lowes.utils.parameterization;

import lowes.utils.StringHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _03 {
    @ParameterizedTest
    @CsvFileSources(value = {
            @CsvFileSource(resources = {"/data.csv","/data1.csv"})
    })
    public void test(String input, String output) {
        assertEquals(output, StringHelper.truncateAInFirst2Positions(input));
    }
}
