package m09_functional_programming_using_streams._01_method_reference;

@FunctionalInterface
interface ProductInterface {
    abstract Product getProduct(String name, int price);
}

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class _04 {
    public static void main(String[] args) {
//        ProductInterface iPhone = (name,price)->  new Product(name,price);
        ProductInterface iPhone = Product::new;
        Product iPHoneproduct = iPhone.getProduct("IPhone",1000);
        System.out.println(iPHoneproduct.toString());

    }
}
