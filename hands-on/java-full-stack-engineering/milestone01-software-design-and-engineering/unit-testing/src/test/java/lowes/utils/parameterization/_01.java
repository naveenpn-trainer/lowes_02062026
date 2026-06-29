package lowes.utils.parameterization;

import lowes.utils.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class _01 {

    @ParameterizedTest
    @ValueSource(ints = {10,12,14,20})
    public void test_01(int input){
        Assertions.assertTrue(MathUtils.isEven(input));
    }


}
