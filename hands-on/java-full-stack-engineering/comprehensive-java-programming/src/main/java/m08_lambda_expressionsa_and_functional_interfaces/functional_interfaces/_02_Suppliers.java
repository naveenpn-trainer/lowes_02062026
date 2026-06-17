package m08_lambda_expressionsa_and_functional_interfaces.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class LocalSupplier implements Supplier<Product> {
    @Override
    public Product get() {
        return new Product("Local Product", 20.0);
    }
}

class OnlineSupplier implements Supplier<Product> {
    @Override
    public Product get() {
        return new Product("Online Product", 25.0);
    }
}

public class _02_Suppliers {
    public static void main(String[] args) {
        Supplier localSupplier = new LocalSupplier();
        Product localProduct = (Product) localSupplier.get();
        System.out.println("Local product: " + localProduct.getName() + ", Price: $" + localProduct.getPrice());

        Supplier onlineSupplier = () -> new Product("Online Product", 25.0);
        Product onlineProduct = (Product) onlineSupplier.get();
        System.out.println("Online product: " + onlineProduct.getName() + ", Price: $" + onlineProduct.getPrice());

        Supplier<Product> retailSupplier = () ->new Product("Retail Supplier",140);

        Consumer<Product> printDetailsConsumer = (e) -> {
            System.out.println(e.getPrice());
        };

        System.out.println(retailSupplier.get().getName());
        printDetailsConsumer.accept(localProduct);
    }
}
