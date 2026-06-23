package hands_on._02_di.c_constructor_di_with_bean_modification;

public interface Payment {
    String getType();
    void validatePayment();
    void pay();
    void acknowledge();
}
