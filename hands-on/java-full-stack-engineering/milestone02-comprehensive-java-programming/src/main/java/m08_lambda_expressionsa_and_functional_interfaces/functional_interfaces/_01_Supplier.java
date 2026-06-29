package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces;

import java.util.function.Supplier;

public class _01_Supplier {
    public static void main(String[] args) {
        Supplier<Double> supplier =() -> Math.random();
        System.out.println(supplier.get());
    }
}
