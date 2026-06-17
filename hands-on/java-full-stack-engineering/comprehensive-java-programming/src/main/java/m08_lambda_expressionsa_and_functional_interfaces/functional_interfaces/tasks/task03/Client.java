package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces.tasks.task03;

import java.util.function.Function;

public class Client {
    public static void main(String[] args) {
        Function<Stock, StockNew> transferObjects = (s)->new StockNew(s.companyName,s.price);



    }
}
