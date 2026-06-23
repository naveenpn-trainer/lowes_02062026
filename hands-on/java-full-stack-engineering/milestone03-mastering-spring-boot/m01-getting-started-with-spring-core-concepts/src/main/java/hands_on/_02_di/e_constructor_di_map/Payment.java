package hands_on._02_di.e_constructor_di_map;

public interface Payment {
    String getType();
    void validatePayment();
    void pay();
    void acknowledge();
}
